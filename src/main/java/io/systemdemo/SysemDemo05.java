package io.systemdemo;

import java.io.InputStream;

/**
 * system.in
 * @author lfj  2015年12月14日
 * @Description: 不指定大小 汉字仍会产生乱码问题 因为是按字节一个一个读的
 * 一个汉字占两个字节
 * 解决：先全部放到内存中，再一次性读取，即用 BufferReader
 */
public class SysemDemo05 {
    public static void main(String[] args) throws Exception{
        InputStream input = System.in;  // 通过键盘接收数据
        StringBuffer buf = new StringBuffer();  // 声明StringBuffer用于接收数据
        
        System.out.println("请输入内容：");
        int temp = 0 ;
        while ((temp = input.read()) != -1) {   // 循环接收
            char c = (char) temp;    // 将数据变为字符
            if (c == '\n') {
                break;      // 退出循环，按Enter键
            }
            buf.append(c);
        }
        System.out.println("输入的内容为：" + buf);
        input.close();
    }
}
