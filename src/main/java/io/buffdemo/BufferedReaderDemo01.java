package io.buffdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 键盘输入数据的标准格式
 * @author lfj  2015年12月14日
 * @Description: 从键盘输入数据
 */
public class BufferedReaderDemo01 {
    public static void main(String[] args) {
        BufferedReader buf = null; // 声明bufferedReader对象
        buf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        System.out.println("请输入内容：");
        try {
            str = buf.readLine();   // 读取输入内容
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("输入的内容为：" + str);
    }
}
