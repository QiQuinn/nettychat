package com.qiquinn;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.*;
import io.netty.util.CharsetUtil;


/**
 * @Author:QiQuinn
 * @Desicription: 自定义助手类 (对于请求来说，这个类相当于【入站、入境】)
 * @Date:Created in 2019/8/6
 * @Modified By:
 */
public class CustomHandler extends SimpleChannelInboundHandler<HttpObject>
{
    @Override
    protected void channelRead0(ChannelHandlerContext context, HttpObject httpObject) throws Exception {
        Channel channel = context.channel();
        if(httpObject instanceof  HttpRequest)
        {
//            System.out.println("客户端："+channel.remoteAddress());
            /* 发消息需要用缓冲区，创建一个缓冲区存消息 */
            ByteBuf byteBuf = Unpooled.copiedBuffer("Hello,Netty", CharsetUtil.UTF_8);
            /* 构建httpresponse */
            FullHttpResponse response = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1,HttpResponseStatus.OK
                    ,byteBuf);
            /* 设置响应内容和长度 */
            response.headers().set(HttpHeaderNames.CONTENT_TYPE,"text/plain");
            response.headers().set(HttpHeaderNames.CONTENT_LENGTH,byteBuf.readableBytes());
            //把响应返回给客户端(单write只是写道缓冲区)
            context.writeAndFlush(response);
        }
    }

    @Override
    public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
        super.channelRegistered(ctx);
        System.out.println("channelRegistered：注册");
    }

    @Override
    public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
        super.channelUnregistered(ctx);
        System.out.println("channelUnregistered：移除");
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);
        System.out.println("channelActive：活跃");
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        super.channelInactive(ctx);
        System.out.println("channelInactive：不活跃(断开连接)");
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        super.channelReadComplete(ctx);
        System.out.println("channelReadComplete：读取数据完毕");
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        super.userEventTriggered(ctx, evt);
        System.out.println("userEventTriggered：用户时间触发");
    }

    @Override
    public void channelWritabilityChanged(ChannelHandlerContext ctx) throws Exception {
        super.channelWritabilityChanged(ctx);
        System.out.println("channelWritabilityChanged：可写时间更改");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        super.exceptionCaught(ctx, cause);
        System.out.println("exceptionCaught:异常");
        ctx.close();
    }
}
