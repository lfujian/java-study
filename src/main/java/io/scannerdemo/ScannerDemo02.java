package io.scannerdemo;

import java.util.Scanner;

/**
 * @author lfj  2015年12月15日
 * @Description: 修改输入数据的分隔符
 */
public class ScannerDemo02 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");    // 分隔符改为回车
        System.out.print("输入数据：");
        String str = scan.next();
        System.out.println("输入的数据为：" + str);
    }
}
