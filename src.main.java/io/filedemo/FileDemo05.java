package io.filedemo;

import java.io.File;

/**
 * @author lfj  2015年11月4日
 * @Description: 创建文件夹  ---mkdirs()---
 */
public class FileDemo05 {
    public static void main(String[] args) {
        File f = new File("d:" + File.separator + "test");
        f.mkdirs();
    }
}
