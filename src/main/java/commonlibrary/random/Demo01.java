package commonlibrary.random;

import java.util.Random;

/**
 * @author lfj  2015年8月21日
 * @Description: 随机产生10个数字，且数字不大于100
 */
public class Demo01 {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("随机生成给定最大值的int值");
        for(int i=0;i<10;i++){
            System.out.print(r.nextInt(100)+"--");
        }
        System.out.println("\n随机生成boolean值");
        for(int i=0;i<10;i++){
            System.out.print(r.nextBoolean()+"--");
        }
        System.out.println("\n随机生成Double值");  //如0.4802685815660954
        for(int i=0;i<10;i++){
            System.out.print(r.nextDouble()+"--");
        }
        int random = Double.valueOf(new Random().nextInt(899999) + 100000).intValue();
        System.out.println("\n随机六位数:"+random);
    }
}
