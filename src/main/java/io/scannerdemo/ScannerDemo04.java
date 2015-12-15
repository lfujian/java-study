package io.scannerdemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author lfj  2015年12月15日
 * @Description: 得到时间
 */
public class ScannerDemo04 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.print("输入日期(yyyy-MM-dd)：");
        String str = null;
        Date date = null;
        if (scan.hasNext("^\\d{4}-\\d{2}-\\d{2}$")) { // 正则验证
            str = scan.next("^\\d{4}-\\d{2}-\\d{2}$"); // 接收日期格式的字符串
            try {
                date = new SimpleDateFormat("yyyy-MM-dd").parse(str);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("日期格式错误！");
        }
        System.out.println(date);
    }
}
