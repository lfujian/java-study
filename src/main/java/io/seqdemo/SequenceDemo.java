package io.seqdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;

/**
 * 合并流 --- 将两个文件合并成一个文件 --- SequenceInputStream
 * @author lfj  2015年12月15日
 * @Description: 合并两个文件
 */
public class SequenceDemo {
    public static void main(String[] args) throws Exception{
        InputStream is1 = null;   // 输入流
        InputStream is2 = null;
        OutputStream os = null;  // 输出流
        SequenceInputStream sis = null;   // 合并流
        is1 = new FileInputStream("D:" + File.separator + "a.txt");
        is2 = new FileInputStream("D:" + File.separator + "b.txt");
        os = new FileOutputStream("D:" + File.separator + "ab.txt");
        sis = new SequenceInputStream(is1, is2);  // 实例化合并流
        int temp = 0;
        while ((temp = sis.read()) != -1) {  // 循环输出
            os.write(temp);     // 保存内容
        }
        sis.close();
        is1.close();
        is2.close();
        os.close();
    }
}
