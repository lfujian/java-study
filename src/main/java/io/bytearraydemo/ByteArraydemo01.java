package io.bytearraydemo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * 内存操作流 -- 输出的位置设置在内存上,生成临时信息时使用 -- ByteArrayInputStream ByteArrayOutputStream
 * ByteArrayInputStream:将内容写到内存中
 * ByteArrayOutputStream:将内存中的数据输出
 * @author lfj  2015年11月30日
 * @Description: 使用内存操作流完成一个大写字母转换为小写字母的程序
 */
public class ByteArraydemo01 {
    public static void main(String[] args) {
        String str = "HELLOWILDDOG";
        ByteArrayInputStream bis = null;
        ByteArrayOutputStream bos = null;
        bis = new ByteArrayInputStream(str.getBytes());
        bos = new ByteArrayOutputStream();
        int temp = 0;
        while ((temp = bis.read()) != -1) {
            char c = (char) temp;
            bos.write(Character.toLowerCase(c));
        }
        String newStr = bos.toString();
        try {
            bis.close();
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(newStr);
    }
}
