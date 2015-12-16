package io.zipdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry; // 表示一个子文件
import java.util.zip.ZipOutputStream; // GZIP压缩输出流

/**
 * java.util.zip --- 完成一个文件或文件夹的压缩 --- ZipOutputStream
 * @author lfj  2015年12月16日
 * @Description: 压缩一个文件
 */
public class ZipOutputStreamDemo01 {
    public static void main(String[] args) throws Exception{
        File file = new File("d:" + File.separator + "test.txt"); // 要压缩的文件
        File zipFile = new File("d:" + File.separator + "test.zip"); // 压缩文件的名称
        InputStream input = new FileInputStream(file); // 输入文件流
        ZipOutputStream zipOut = null;
        // 实例化压缩输出流对象，并指定压缩文件的输出路径
        zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
        // 设置每一个ZipEntry对象
        zipOut.putNextEntry(new ZipEntry(file.getName()));
        zipOut.setComment("www.wilddog.com"); // 设置ZIP文件的注释
        int temp =0;
        while ((temp = input.read()) != -1) {
            zipOut.write(temp); // 压缩输出内容
        }
        input.close();
        zipOut.close();
    }
}
