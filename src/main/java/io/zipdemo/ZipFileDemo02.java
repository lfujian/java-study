package io.zipdemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * 解压缩 ZipEntry
 * @author lfj  2015年12月16日
 * @Description: 解压缩文件 -- 解压一个文件
 */
public class ZipFileDemo02 {
    public static void main(String[] args) throws Exception{
        File file = new File("d:" + File.separator + "test.zip");
        File outputFile = new File("d:" + File.separator + "test.txt");
        @SuppressWarnings("resource")
        ZipFile zipFile = new ZipFile(file);
        ZipEntry entry = zipFile.getEntry("test.txt");
        InputStream input = zipFile.getInputStream(entry);
        OutputStream out = new FileOutputStream(outputFile);
        int temp = 0;
        while ((temp = input.read()) != -1) {
            out.write(temp);
        }
        input.close();
        out.close();
    }
}
