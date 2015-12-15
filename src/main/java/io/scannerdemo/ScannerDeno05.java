package io.scannerdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 从文件中得到数据
 * @author lfj  2015年12月15日
 * @Description: 读取 test.txt 文件
 */
public class ScannerDeno05 {
    public static void main(String[] args) {
        // 指定文件
        File f = new File("D:" + File.separator + "test.txt");
        // 接收数据
        Scanner scan = null;
        try {
            scan = new Scanner(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        StringBuffer str = new StringBuffer();
        while (scan.hasNext()) {    // 判断是否还有内容
            str.append(scan.next()).append("\n");  // 遇空格换行
        }
        System.out.println(str);
    }
}
