import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class MyTest {

    public static void main(String[] args) {
        
        /*Integer a=1000,b=1000;
        Integer c=100,d=100;
        System.out.println(a==b);// '==' 比较的是对象的引用，按说都应是false，但Integer的valueof有缓存-128到127
        System.out.println(c==d);
        
        System.out.println("-------String-------");
        String s1="abc";
        String s2="abc";
        String s3=new String("abc");
        System.out.println(s1==s2);
        System.out.println(s1==s3);*/
        /**
         * 一些基本类型的变量和对象的引用变量都是在函数的栈内存中分配，而堆内存中则存放new 出来的对象和数组。然而除此之外还有一块区域叫做常量池。
         * 像我们通常想String s1 = "abc"; 这样申明的字符串对象，其值就是存储在常量池中。
         * 当我们创建String s1 = "abc"这样一个对象之后，"abc"就存储到了常量池（也可叫做字符串池）中，
         * 当我们创建引用String s2 = "abc" 的时候，Java底层会优先在常量池中查找是否存在"abc"，如果存在则让s2指向这个值，不会重新创建，如果常量池中没有则创建并添加的池中。
         */
//        String host = "127.0.0.1";
//        if (host != null ) {
//            String[] ips = host.split("\\.");
//            System.out.println(ips.length);
//            System.out.println(ips);
//            String appId = ips[1];
//            System.out.println(appId);
//        }
//        int t = new Random().nextInt(1000);
//        long c = System.currentTimeMillis() * 1000;
//        System.out.println(c);
//        System.out.println(t);
//        System.out.println(t+c);
        Integer s = getTokenVersion();
        System.out.println(s);
    }
    public static Integer getTokenVersion() {
//        System.out.println(null instanceof Integer);
//        System.out.println((  )(0.0));
        double i = 0.0;
        Map<String, Object> d = new HashMap<String, Object>();
        d.put("tokenVersion", i);
        if (d != null) {
            Object obj = d.get("tokenVersion");
            System.out.println(obj.getClass());
            if (obj instanceof Double) {
                return Integer.valueOf(((Double) obj).intValue());
            }
        }
        return null;
    }
}
