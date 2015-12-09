package io.filedemo;

import java.io.File;

/**
 * @author lfj 2015年11月4日
 * @Description: 删除文件
 */
public class FileDemo04 {
    public static void main(String[] args) {
        File f = new File("d:" + File.separator + "test.txt");
        if (f.exists()) { // 判断文件是否存在
            f.delete();
        } else {
            System.out.println("文件不存在。");
        }
    }
}
