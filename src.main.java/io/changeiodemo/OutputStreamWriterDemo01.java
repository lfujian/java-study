package io.changeiodemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * @author lfj  2015年11月30日
 * @Description: 将子节输出流变为字符输出流
 */
public class OutputStreamWriterDemo01 {
    public static void main(String[] args) throws Exception{
        File f = new File("d:"+ File.separator+"test.txt");
        Writer out =null;
        out = new OutputStreamWriter(new FileOutputStream(f));
        out.write("hello wilddog");
        out.close();
    }
}
