package net;

import java.net.InetAddress;

/**
 * @author lfj  2016年7月12日
 * @Description: 测试 InetAddresss 类
 */
public class InetAddressDemo {
    public static void main(String[] args) throws Exception {
        
        InetAddress locAdd = null;
        
        InetAddress remAdd = null;
        
        locAdd = InetAddress.getLocalHost();
        
        remAdd = InetAddress.getByName("www.baidu.com");
        
        System.out.println("本机IP地址：" + locAdd.getHostAddress());
        
        System.out.println("远程IP地址：" + remAdd.getHostAddress());
        
        System.out.println("本机是否可达：" + locAdd.isReachable(5000));
    }
}
