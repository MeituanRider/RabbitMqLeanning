package com.rabbitmq.RabbitMq;

import cn.hutool.core.util.NetUtil;

import javax.swing.*;

/**
 * Created by MtRider on 2021/9/20 19:55
 */
public class RabbitMQUtil {
    public static void main(String[] args) {
        checkServer();
    }
    public static void checkServer(){
        final int port=15672;
        if(NetUtil.isUsableLocalPort(port)){
            JOptionPane.showMessageDialog(null, "RabbitMQ 服务器未启动 ");
            System.exit(1);
        }else{
            System.out.println("RabbitMQ服务器端口15672启动成功");
        }
    }
}
