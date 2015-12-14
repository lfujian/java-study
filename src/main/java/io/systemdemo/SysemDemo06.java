package io.systemdemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * 重定向”标准“输出流
 * @author lfj  2015年12月14日
 * @Description: 为 System.out 输出重定向
 */
public class SysemDemo06 {
    public static void main(String[] args) throws Exception{
        System.setOut(new PrintStream(new FileOutputStream("d:" + File.separator + "read.txt")));
        System.out.print("www.wilddog.com");
        System.out.println(",野狗");
    }
}
