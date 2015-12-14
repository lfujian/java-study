package io.systemdemo;

/**
 * 错误信息输出 --- System.err
 * @author lfj  2015年12月10日
 * @Description: 
 */
public class SystemDemo02 {
    public static void main(String[] args) {
        String str = "hello wilddog";
        try {
            System.out.println(Integer.parseInt(str));
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
