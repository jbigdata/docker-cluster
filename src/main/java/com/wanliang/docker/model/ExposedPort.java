package com.wanliang.docker.model;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.node.NullNode;

import java.io.IOException;
import java.util.Map;

import static com.wanliang.docker.model.InternetProtocol.TCP;
import static com.wanliang.docker.model.InternetProtocol.UDP;

/**
 * Represents a container port that Docker exposes to external clients. The port is defined by its {@link #getPort()
 * port number} and an {@link InternetProtocol}. It can be published by Docker by
 * {@link Ports#bind(ExposedPort, Binding) binding} it to a host port, represented by a {@link Binding}.
 */
@JsonDeserialize(using = ExposedPort.Deserializer.class)
@JsonSerialize(using = ExposedPort.Serializer.class)
public class ExposedPort {

    private final InternetProtocol protocol;

    private final int port;

    /**
     * Creates an {@link ExposedPort} for the given parameters.
     *
     * @param port
     *            the {@link #getPort() port number}
     * @param protocol
     *            the {@link InternetProtocol}
     */
    public ExposedPort(int port, InternetProtocol protocol) {
        this.port = port;
        this.protocol = protocol;
    }

    /**
     * Creates an {@link ExposedPort} for the given {@link #getPort() port number} and {@link InternetProtocol#DEFAULT}.
     *
     * @param port
     *            the {@link #getPort() port number}
     */
    public ExposedPort(int port) {
        this(port, InternetProtocol.DEFAULT);
    }

    /**
     * Creates an {@link ExposedPort} for the given parameters.
     *
     * @param scheme
     *            the {@link #getScheme() scheme}, <code>tcp</code> or <code>udp</code>
     * @param port
     *            the {@link #getPort() port number}
     * @deprecated use {@link #ExposedPort(int, InternetProtocol)}
     */
    @Deprecated
    public ExposedPort(String scheme, int port) {
        this(port, InternetProtocol.valueOf(scheme));
    }

    /**
     * @return the {@link InternetProtocol} of the {@link #getPort() port} that the container exposes
     */
    public InternetProtocol getProtocol() {
        return protocol;
    }

    /**
     * @return the scheme (internet protocol), <code>tcp</code> or <code>udp</code>
     * @deprecated use {@link #getProtocol()}
     */
    @Deprecated
    public String getScheme() {
        return protocol.toString();
    }

    /** @return the port number that the container exposes */
    public int getPort() {
        return port;
    }

    /**
     * Creates an {@link ExposedPort} for {@link InternetProtocol#TCP}. This is a shortcut for
     * <code>new ExposedPort(port, {@link InternetProtocol#TCP})</code>
     */
    public static ExposedPort tcp(int port) {
        return new ExposedPort(port, TCP);
    }

    /**
     * Creates an {@link ExposedPort} for {@link InternetProtocol#UDP}. This is a shortcut for
     * <code>new ExposedPort(port, {@link InternetProtocol#UDP})</code>
     */
    public static ExposedPort udp(int port) {
        return new ExposedPort(port, UDP);
    }

    /**
     * Parses a textual port specification (as used by the Docker CLI) to an {@link ExposedPort}.
     *
     * @param serialized
     *            the specification, e.g. <code>80/tcp</code>
     * @return an {@link ExposedPort} matching the specification
     * @throws IllegalArgumentException
     *             if the specification cannot be parsed
     */
    public static ExposedPort parse(String serialized) throws IllegalArgumentException {
        try {
            String[] parts = serialized.split("/");
            switch (parts.length) {
                case 1:
                    return new ExposedPort(Integer.valueOf(parts[0]));
                case 2:
                    return new ExposedPort(Integer.valueOf(parts[0]), InternetProtocol.parse(parts[1]));
                default:
                    throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Error parsing ExposedPort '" + serialized + "'");
        }
    }

    /**
     * Returns a string representation of this {@link ExposedPort} suitable for inclusion in a JSON message. The format
     * is <code>port/protocol</code>, like the argument in {@link #parse(String)}.
     *
     * @return a string representation of this {@link ExposedPort}
     */
    @Override
    public String toString() {
        return port + "/" + protocol.toString();
    }

    public static class Deserializer extends JsonDeserializer<ExposedPort> {
        @Override
        public ExposedPort deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jsonParser.getCodec();
            JsonNode node = oc.readTree(jsonParser);
            if (!node.equals(NullNode.getInstance())) {
                Map.Entry<String, JsonNode> field = node.fields().next();
                return ExposedPort.parse(field.getKey());
            } else {
                return null;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExposedPort that = (ExposedPort) o;

        if (port != that.port) return false;
        return !(protocol != null ? !protocol.equals(that.protocol) : that.protocol != null);

    }

    @Override
    public int hashCode() {
        int result = protocol != null ? protocol.hashCode() : 0;
        result = 31 * result + port;
        return result;
    }

    public static class Serializer extends JsonSerializer<ExposedPort> {

        @Override
        public void serialize(ExposedPort exposedPort, JsonGenerator jsonGen, SerializerProvider serProvider)
                throws IOException, JsonProcessingException {

            jsonGen.writeStartObject();
            jsonGen.writeFieldName(exposedPort.toString());
            jsonGen.writeEndObject();
        }

    }

}