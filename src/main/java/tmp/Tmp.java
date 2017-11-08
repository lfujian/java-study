package tmp;

import static java.lang.Math.*;
/**
 * @author lfj  2017年3月11日
 * @Description: 临时实验
 */
public class Tmp {
    
    public static void main(String[] args) {
        
        try {
//            ff();
            Integer.valueOf("ss");
        } catch(Exception e) {
        
            System.out.println(e);
        }
        System.out.println("112233");
    }
    
    private static void ff() {
        String s = "ss";
        int i = Integer.valueOf(s);
        System.out.println(i);
    }
}





