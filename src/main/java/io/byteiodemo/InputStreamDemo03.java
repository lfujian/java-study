package io.byteiodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author lfj 2015年11月26日
 * @Description: 从文件中读取内容 （去多余空格 ）（ 开辟指定大小的byte数组）
 */
public class InputStreamDemo03 {
    public static void main(String[] args) throws Exception {
        // 1.使用File类找到一个文件
        File f = new File("d:" + File.separator + "test.txt");
        // 2.通过子类实例化父类对象
        InputStream input = new FileInputStream(f);
         // 3.进行读操作
        byte b[] = new byte[(int) f.length()]; // 所有的内容读到此数组中
        int len = input.read(b);
        // 4.关闭输入流
        input.close();
        
        System.out.println("读入数据的长度:"+len);
        System.out.println("内容为：" + new String(b,0,len)); // 把数组变成字符串输出
    }
}

