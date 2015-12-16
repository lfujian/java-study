package io.zipdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/**
 * ZipInputStream --- 读取ZIP格式的压缩文件 -- 可以获取其中每一个ZipEntry
 * @author lfj  2015年12月16日
 * @Description: 解压缩 test.txt 文件
 */
public class ZipInputStreamDemo02 {
    public static void main(String[] args) throws Exception{
        File file = new File("d:" + File.separator + "test.zip"); // 压缩文件
        File outFile = null;    // 定义输出的文件对象
        @SuppressWarnings("resource")
        ZipFile zipFile = new ZipFile(file); // 实例化ZipFile对象
        @SuppressWarnings("resource")
        ZipInputStream zipInput = new ZipInputStream(new FileInputStream(file)); // 实例化ZIP输入流
        ZipEntry entry = null; // 用于接收压缩文件中的每一个实体
        InputStream input = null; // 用于读取每一个ZipEntry
        OutputStream output = null; // 用于输出每一个实体内容
        while ((entry = zipInput.getNextEntry()) != null) { // 得到每一个ZipEntry
            System.out.println("解压缩" + entry.getName() + "文件。");
            outFile = new File("d:" + File.separator + entry.getName());
            if (!outFile.getParentFile().exists()) {
                outFile.getParentFile().mkdirs();
            }
            if (!outFile.exists()) {
                outFile.createNewFile();
            }
            input = zipFile.getInputStream(entry);
            output = new FileOutputStream(outFile);
            int temp =0;
            while ((temp = input.read()) != -1) {
                output.write(temp);
            }
            input.close();
            output.close();
        }
    }
}
