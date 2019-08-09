package com.qiquinn;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Hello world!
 *
 */
public class AppStart
{
    public static void fff( String[] args ) throws Exception
    {
//        System.out.println(getBuyNum());

        startNettyServer();
    }

    private static void startNettyServer() throws Exception
    {
        //主线程主(用户接受客户端的连接，不做任何操作，分配任务)
        EventLoopGroup mainGroup = new NioEventLoopGroup();
        //从线程组(借到主线程组任务，干活，返回结果)
        EventLoopGroup biboGroup = new NioEventLoopGroup();
        try
        {
            //nety服务器的创建,serverBootsStrap为启动类
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap.group(mainGroup,biboGroup)         //设置线程池
                    .channel(NioServerSocketChannel.class)  //设置nio双向通道
                    .childHandler(new HelloServerInitializer());     //自处理器
            //启动server并绑定8183端口，启动方式为同步启动
            ChannelFuture channelFuture = serverBootstrap.bind(8183).sync();
            //监听通道来关闭服务，也是同步方式
            channelFuture.channel().closeFuture().sync();
        }
        finally
        {
            mainGroup.shutdownGracefully();
            biboGroup.shutdownGracefully();
        }
    }




    private static Integer getBuyNum()
    {
        Double price = 4.60;
        BigDecimal priceBig = getDecimal(price);
        BigDecimal now = priceBig.multiply(getDecimal(0.85));
        return calculate(price,1000,now.doubleValue());
    }
    private static final BigDecimal MINIMUFUCKPAY = new BigDecimal("0.1000");
    private static Integer calculate(Double fristPrice,Integer fristBuyNum,Double depreciate)
    {
        /* 股票默认单价 */
        BigDecimal defualtPrice = getDecimal(fristPrice);
        /* 首次购买的数量 */
        BigDecimal defualtBuyNum = getDecimal(fristBuyNum);
        /* 现价 */
        BigDecimal off = getDecimal(depreciate);
        /* 付款的原始花费总价 */
        BigDecimal payOldSum = defualtBuyNum.multiply(defualtPrice);
        /* 现在的价格 */
        BigDecimal nowPrice = off;
        /* 付款的现价 */
        BigDecimal payNowSum = defualtBuyNum.multiply(nowPrice);
        /* 亏损总额 */
        BigDecimal fuckPay = payOldSum.subtract(payNowSum);
        /* 亏损百分比 */
        BigDecimal fuckPrecent = fuckPay.divide(payOldSum,4, RoundingMode.HALF_UP);

        int secoundBuyNum = 0;
        while(fuckPrecent.compareTo(MINIMUFUCKPAY)==1)
        {
            secoundBuyNum++;
            BigDecimal secoundBuy = getDecimal(1);
            /* 第二次购买的总价格 */
            BigDecimal secoundSum = secoundBuy.multiply(nowPrice);
            /* 第一次购买原价与第二次购买价格总和 */
            payOldSum = payOldSum.add(secoundSum);
            /* 第一次购买现价与第二次购买现价 */
            payNowSum = payNowSum.add(secoundSum);
            /* 亏损额计算 */
            fuckPay = payOldSum.subtract(payNowSum);
            /* 计算亏损率 */
            fuckPrecent = fuckPay.divide(payOldSum,4, RoundingMode.HALF_UP);
        }
        return secoundBuyNum;
    }
    private static BigDecimal getDecimal(Double price)
    {
        return new BigDecimal(Double.toString(price));
    }
    private static BigDecimal getDecimal(Integer num)
    {
        return new BigDecimal(Integer.toString(num));
    }

}
