package io.scannerdemo;

import java.util.Scanner;

/**
 * 专门的输入数据类 完成输入数据操作并进行验证 可以接收任意的输入流
 * @author lfj  2015年12月15日
 * @Description: 输入数据
 * 有空格时无法读取 因为此时以空格为分隔符
 */
public class ScannerDemo01 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in); // 从键盘接收数据
        System.out.print("输入数据：");
        String str = scan.next();
        System.out.println("输入的数据为：" + str);
    }
}
