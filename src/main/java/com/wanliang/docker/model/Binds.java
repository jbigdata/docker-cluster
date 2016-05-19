package com.wanliang.docker.model;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.node.NullNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@JsonSerialize(using = Binds.Serializer.class)
@JsonDeserialize(using = Binds.Deserializer.class)
public class Binds {

    private Bind[] binds;

    public Binds(Bind... binds) {
        this.binds = binds;
    }

    public Bind[] getBinds() {
        return binds;
    }

    public static class Serializer extends JsonSerializer<Binds> {

        @Override
        public void serialize(Binds binds, JsonGenerator jsonGen, SerializerProvider serProvider) throws IOException {

            //
            jsonGen.writeStartArray();
            for (Bind bind : binds.getBinds()) {
                jsonGen.writeString(bind.toString());
            }
            jsonGen.writeEndArray();
            //
        }

    }

    public static class Deserializer extends JsonDeserializer<Binds> {
        @Override
        public Binds deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
                throws IOException {

            List<Bind> binds = new ArrayList<Bind>();
            ObjectCodec oc = jsonParser.getCodec();
            JsonNode node = oc.readTree(jsonParser);
            for (Iterator<JsonNode> it = node.elements(); it.hasNext();) {

                JsonNode field = it.next();
                if (!field.equals(NullNode.getInstance())) {
                    binds.add(Bind.parse(field.textValue()));
                }
            }
            return new Binds(binds.toArray(new Bind[0]));
        }
    }

    @Override
    public String toString() {
        return "Binds{" +
                "binds=" + Arrays.toString(binds) +
                '}';
    }
}