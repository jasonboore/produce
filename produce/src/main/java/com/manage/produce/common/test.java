package com.manage.produce.common;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class test {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            System.out.println("本机IP:"+ inetAddress.getHostAddress().toString());
            System.out.println("本机名称:" + inetAddress.getHostName().toString());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
