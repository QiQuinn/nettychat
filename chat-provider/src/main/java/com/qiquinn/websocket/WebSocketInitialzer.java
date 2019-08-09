package com.qiquinn.websocket;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.stream.ChunkedWriteHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author:QiQuinn
 * @Desicription: netty初始化启动设置
 * @Date:Created in 2019/8/7
 * @Modified By:
 */
public class WebSocketInitialzer extends ChannelInitializer<SocketChannel>
{
    private Logger log = LoggerFactory.getLogger(WebSocketInitialzer.class);
    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {

        ChannelPipeline pipeline = socketChannel.pipeline();
        /* Websocket基于http协议，所以使用http编解码器 */
        pipeline.addLast(new HttpServerCodec());
        /* 大数据流处理器 */
        pipeline.addLast(new ChunkedWriteHandler());
        /* 对httpmessage进行聚合，聚合了FullHttpRequest或FullHttpResponse */
        pipeline.addLast(new HttpObjectAggregator(1024*64));

//      ========================= 以上支持就是对http的支持 ===========================
        /* Websocket服务器处理协议，用域指定给客户端连接访问路由：/ws
        *  本handler会帮你处理一些繁琐复杂的事
        *  会帮你处理握手操作: handshaking(close,ping,pong)
        *  对于webSocket来说，都是以frames来传输的，不同的数据类型对应的frames也不一样
        * */
        pipeline.addLast(new WebSocketServerProtocolHandler("/ws"));
        /* 自定义控制器(主要负责消息处理) */
        pipeline.addLast(new ChatHandler());
        log.info("WebSocketInitialzer设置完成");
    }
}
