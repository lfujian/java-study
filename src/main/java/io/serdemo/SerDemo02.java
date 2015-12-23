package io.serdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

/**
 * 对象输入流 --- ObjectInputStream
 * @author lfj  2015年12月19日
 * @Description: 从文件中将Person对象反序列化（读取）
 */
public class SerDemo02 {
    public static void main(String[] args) throws Exception{
        File f = new File("D:" + File.separator + "test.txt");
        ObjectInputStream ois = null;
        InputStream input = new FileInputStream(f);
        ois = new ObjectInputStream(input);
        Object obj = ois.readObject();
        ois.close();
        System.out.println(obj);
    }
}
