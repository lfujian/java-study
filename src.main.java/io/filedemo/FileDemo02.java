package io.filedemo;

import java.io.File;

/**
 * @author lfj 2015年8月29日
 * @Description: 观察File类中提供的两个常量
 */
public class FileDemo02 {
    public static void main(String[] args) {
        // 路径分隔符
        System.out.println("pathSeparator: " + File.pathSeparator);
        // 符合本地操作系统的分隔符，已满足可移植性的目的
        System.out.println("separator: " + File.separator);
    }
}
// pathSeparator: ;
// separator: \