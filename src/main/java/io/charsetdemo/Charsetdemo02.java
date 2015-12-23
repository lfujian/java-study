package io.charsetdemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * 乱码产生 -- 输出内容的编码 与 接收内容的编码 不一致
 * @author lfj  2015年12月19日
 * @Description: 使用 ISO8859-1 编码
 */
public class Charsetdemo02 {
    public static void main(String[] args) throws Exception{
        File f = new File("D:" + File.separator + "test.txt");
        OutputStream out = new FileOutputStream(f);
        byte b[] = "你好！".getBytes("ISO8859-1"); // 指定编码
        out.write(b);
        out.close();
    }
}
