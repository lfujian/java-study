package io.systemdemo;

import java.io.IOException;
import java.io.OutputStream;

/**
 * system类对IO的支持
 * @author lfj  2015年12月10日
 * @Description: 使用OutputStream向屏幕输出
 */
public class SystemDemo01 {
    public static void main(String[] args) {
        // 此时的输出流是向屏幕上输出
        OutputStream out = System.out ;
        try {
            out.write("hello wilddog".getBytes()); // 向屏幕上输出
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
