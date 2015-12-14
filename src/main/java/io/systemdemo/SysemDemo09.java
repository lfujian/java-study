package io.systemdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 用重定向方式将文件中的内容读取进来
 * @author lfj  2015年12月14日
 * @Description: 设置System.in 的输入重定向
 */
public class SysemDemo09 {
    public static void main(String[] args) throws Exception{
        System.setIn(new FileInputStream("d:" + File.separator + "demo.txt")); // 设置输入重定向
        InputStream input = System.in; // 从文件中接收数据
        byte b[] = new byte[1024]; // 开辟空间
        int len = input.read(b); // 读
        System.out.println("输入的内容为：" + new String(b,0,len));
        input.close();
    }
}
