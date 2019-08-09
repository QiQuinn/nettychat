package com.qiquinn;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpServerCodec;


/**
 * @Author:QiQuinn
 * @Desicription: 初始化器,channal注册后会执行里面的初始化方法
 * @Date:Created in 2019/8/6
 * @Modified By:
 */
public class HelloServerInitializer extends ChannelInitializer<SocketChannel>
{
    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        ChannelPipeline channelPipeline = socketChannel.pipeline();
        /* 通过管道添加handler
         * HttpServerCodec是由NETTY自己提供的助手类，可以理解为拦截器
         * 当请求到服务器，我们需要做解码，响应到客户端做节解码**/
        channelPipeline.addLast("httpServerCodec",new HttpServerCodec());
        //添加自定义助手类
        channelPipeline.addLast("customHandler",new CustomHandler());
    }
}
