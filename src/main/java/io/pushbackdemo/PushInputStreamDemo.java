package io.pushbackdemo;

import java.io.ByteArrayInputStream;
import java.io.PushbackInputStream;

/**
 * 回退流 --- PushbackInputStream --- 把读取进来的某些数据重新退回到输入流的缓冲区中
 * @author lfj  2015年12月17日
 * @Description: 操作回退流
 */
public class PushInputStreamDemo {
    public static void main(String[] args) throws Exception{
        String str = "www.wilddog.com";
        PushbackInputStream push = null;
        ByteArrayInputStream bai = null;
        bai = new ByteArrayInputStream(str.getBytes());
        push = new PushbackInputStream(bai);
        System.out.println("读取之后的数据为：");
        int temp = 0;
        while ((temp = push.read()) != -1) {
            if (temp == '.') {
                push.unread(temp); // 回退到缓冲区前面
                temp = push.read(); // 空出此数据
                System.out.print("(退回"+(char)temp+")");
            } else {
                System.out.print((char)temp);
            }
        }
    }
}
