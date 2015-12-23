package io.serdemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * 对象输出流 --- ObjectOutputStream
 * @author lfj  2015年12月19日
 * @Description: 将Person类的对象保存在文件中 （全是二进制内容）
 * 只有属性被序列化
 */
public class SerDemo01 {
    public static void main(String[] args) throws Exception{
        File f = new File("D:" + File.separator + "test.txt");
        ObjectOutputStream oos = null;
        OutputStream out = new FileOutputStream(f);
        oos = new ObjectOutputStream(out);
        oos.writeObject(new Person("张三", 30));
        oos.close();
    }
}
