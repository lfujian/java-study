package io.changeiodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * @author lfj  2015年11月30日
 * @Description: 将字节输入流变为字符输入流
 */
public class InputStreamReaderDemo01 {
    public static void main(String[] args) throws Exception{
        File f = new File("d:"+ File.separator+"test.txt");
        Reader reader = null;
        reader = new InputStreamReader(new FileInputStream(f)); // 将子节流变为字符流
        char c[] = new char[1024];
        int len = reader.read(c);
        reader.close();
        System.out.println(new String(c,0,len));
    }
}
