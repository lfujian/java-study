package io.systemdemo;

import java.io.InputStream;

/**
 * 键盘的输出流
 * @author lfj  2015年12月10日
 * @Description: 从键盘上读取数据
 */
public class SystemDemo03 {
    public static void main(String[] args) throws Exception{
        InputStream input = System.in;
        byte b[] = new byte[1024];
        System.out.println("请输入内容：");
        int len = input.read(b);
        System.out.println("输入的内容为：" + new String(b,0,len));
        input.close();
    }
}
