package io.zipdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author lfj  2015年12月16日
 * @Description: 压缩一个文件夹 --- 判断，循环
 */
public class ZipOutputStreamDemo02 {
    public static void main(String[] args) throws Exception{
        File file = new File("d:" + File.separator + "test"); // 要压缩的文件夹
        File zipFile = new File("d:" + File.separator + "test.zip"); // 压缩文件的名称
        InputStream input = null; // 文件输入流
        ZipOutputStream zipOut = null; // 压缩输出流
        zipOut = new ZipOutputStream(new FileOutputStream(zipFile)); // 实例化
        zipOut.setComment("www.wilddog.com"); // 注释
        if (file.isDirectory()) { //判断file是目录
            File lists[] = file.listFiles(); // 列出所有文件，放入数组
            for (int i = 0; i<lists.length;i++) {
                input = new FileInputStream(lists[i]);
                zipOut.putNextEntry(new ZipEntry(file.getName() + File.separator + lists[i].getName()));// 放到一个文件夹中
                int temp = 0;
                while ((temp = input.read()) != -1) {
                    zipOut.write(temp);
                }
                input.close(); // 注意，每压缩一个文件都实例化一次，同时也要关闭一次
            }
        }
        zipOut.close();
    }
}
