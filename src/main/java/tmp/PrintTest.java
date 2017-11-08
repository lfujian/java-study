package tmp;

import java.util.Date;

/**
 * @author lfj  2017年3月11日
 * @Description: 格式化输出
 */
public class PrintTest {
    public static void main(String[] args) {
        double x = 10000.0 / 3.0;
        double y = -10000.0 / 3.0;
        System.out.println(x); // 3333.3333333333335
        
        // 8个字符宽度  小数点后两位
        System.out.printf("%8.2f", x); //  3333.33 (最前面有个空格)
        System.out.println();
        System.out.printf("%,.2f", x); // 3,333.33
        System.out.println();
        
        System.out.printf("%,(.2f", y); // (3,333.33)
        System.out.println();
        System.out.printf("%+.2f", y); // -3333.33
        System.out.println();
        
        String name = "lee";
        int age = 24;
        System.out.printf("hello, %s. next year,you'll be %d", name, age + 1);
        
        System.out.println("\n========格式化时间======"); 
        System.out.printf("%tc", new Date()); // 获取完整时间 - 星期六 三月 11 18:10:23 CST 2017
        System.out.println("\n---F---");
        System.out.printf("%tF", new Date()); // yyyy-MM-dd  —— 2017-03-11
        System.out.println("\n---D---");
        System.out.printf("%tD", new Date()); // MM/dd/yyyy —— 03/11/17
        System.out.println("\n---T---");
        System.out.printf("%tT", new Date()); // hh:mm:ss —— 18:15:57
        System.out.println("\n---s---");
        System.out.printf("%ts", new Date()); // 1970到现在秒 —— 1489227460   毫秒用Q
        System.out.println("\n---连到一块---");
        System.out.printf("%1$s %2$tF %2$tT","今天是：", new Date()); // 今天是： 2017-03-11 18:23:31
        
        
        
    }
}
