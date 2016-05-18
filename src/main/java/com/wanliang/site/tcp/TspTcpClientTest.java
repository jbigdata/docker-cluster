package com.wanliang.site.tcp;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.Delimiters;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.util.CharsetUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Administrator on 2015/11/11.
 */
public class TspTcpClientTest {

    private static final Logger LOG = LoggerFactory.getLogger(TspTcpClientTest.class);
    public static String HOST = "192.168.85.49";
    public static int PORT = 30500;

    public static void testClient() throws InterruptedException{
        new TspTcpClient(HOST,PORT, new ChannelInitializer<SocketChannel>() {
            @Override
            public void initChannel(SocketChannel ch) throws Exception {
                ChannelPipeline p = ch.pipeline();
                p.addLast(
                        new DelimiterBasedFrameDecoder(81920, Delimiters.lineDelimiter()),
                        new StringDecoder(CharsetUtil.UTF_8),
                        new StringEncoder(CharsetUtil.UTF_8),
                        new ChannelInboundHandlerAdapter(){
                            public void channelActive(ChannelHandlerContext ctx) throws Exception {
                                System.out.println("客户端建立连接: ");
                                ctx.channel().writeAndFlush("testTboxUserId1,testTboxVehicleId1,hello word TCP \r\n");
                            }

                            public void channelRead(ChannelHandlerContext ctx, Object e) {
                                System.out.println("客户端从TcpServer收到消息: " + e);
                            }
                        }
                );
            }
        }).start();
        Thread.sleep(1000000000);
    }

    public static void main(String[] args){
        try {
            TspTcpClientTest.testClient();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
