package com.wanliang.site.tcp;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.Lifecycle;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;

public class TspTcpClient implements Lifecycle {
    private static final Logger LOG = LoggerFactory.getLogger(TspTcpClient.class);
    private final NioEventLoopGroup group;
    private final String host;
    private final int port;

    private ChannelFuture channelFuture;
    private final Bootstrap clientBootstrap;
    private volatile boolean started;

    public TspTcpClient(String host, int port, ChannelHandler handler) {
        this.host = host;
        this.port = port;
        clientBootstrap = new Bootstrap();
        clientBootstrap.handler(handler);
        clientBootstrap.channel(NioSocketChannel.class);
        this.group = new NioEventLoopGroup();
        clientBootstrap.group(group);
    }

    @Override
    public void start() {
        try {
            InetAddress addr = InetAddress.getByName(host);
            channelFuture = clientBootstrap.connect(new InetSocketAddress(addr, port)).sync();
        } catch (Exception e) {
            LOG.error("Unable to start TCP client", e);
            started = false;
            return;
        }
        started = true;
    }

    @Override
    public void stop() {
        if (!started) {
            return;
        }
        try {
            channelFuture.channel().close();
        } catch (Exception e) {
            LOG.warn("Unable to stop client", e);
        } finally {
            group.shutdownGracefully(0, 0, TimeUnit.MILLISECONDS);
        }
    }

    @Override
    public boolean isRunning() {
        return started;
    }

    public Channel getChannel() throws InterruptedException {
        return channelFuture.sync().channel();
    }
}
