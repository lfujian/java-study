package io.byteiodemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @author lfj 2015年11月26日
 * @Description: 向文件中写数据 ，（追加而非覆盖）
 */
public class OutputStreamDemo02 {
    public static void main(String[] args) throws Exception { // 异常抛出，不处理
        // 1.使用File类找到一个文件
        File f = new File("d:" + File.separator + "test.txt"); // 声明File对象。若没有，会自动创建文件
        // 2.通过子类实例化父类对象
        OutputStream out = new FileOutputStream(f, true); //开启追加
        // 3.进行写操作
        String str = "\r\njiajaijai!!!"; // \r\n 自动换行
        byte b[] = str.getBytes(); // 只能输出byte数组，故要将字符串变成byte数组

        out.write(b); // 将数组直接写到文件中

        // 或通过循环，把数组中的内容一个个写到文件之中
        /*
         * for (int i =0;i<b.length;i++) { out.write(b[i]); }
         */

        // 4. 关闭输出流
        out.close();
    }
}
