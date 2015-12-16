package io.zipdemo;

import java.io.File;
import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * ZipInputStream --- 读取ZIP格式的压缩文件 -- 可以获取其中每一个ZipEntry
 * @author lfj  2015年12月16日
 * @Description: 取得 test.zip 中的一个ZipEntry
 */
public class ZipInputStreamDemo01 {
    public static void main(String[] args) throws Exception{
        File zipFile = new File("d:" + File.separator + "test.zip");
        ZipInputStream input = null;
        input = new ZipInputStream(new FileInputStream(zipFile));
        ZipEntry entry = input.getNextEntry(); // 得到一个压缩实体
        System.out.println("压缩实体名称：" + entry.getName());
        input.close();
    }
}
