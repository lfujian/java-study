package io.zipdemo;

import java.io.File;
import java.util.zip.ZipFile;

/**
 * ZipFile --- 表示压缩文件
 * @author lfj  2015年12月16日
 * @Description: 实例化ZipFile类对象
 */
public class ZipFileDemo01 {
    public static void main(String[] args) throws Exception{
        File file = new File("d:" + File.separator + "test.zip");
        @SuppressWarnings("resource")
        ZipFile zipFile = new ZipFile(file);
        System.out.println("压缩文件的名称为：" + zipFile.getName()); // 得到压缩文件的路径名称
    }
}
