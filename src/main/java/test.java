import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class test {

    public static int getmoney(int remainSize, double remainMoney) {
        if (remainSize == 1) {
            remainSize--;
            return (int) (Math.round(remainMoney * 100) / 100);
        }
        
        Random r = new Random();
        double min = 0.01;
        double max = remainMoney / remainSize * 2;
        double money = r.nextDouble() * max;
        money = money <= min ? 0.01 : money;
        money = Math.floor(money * 100) / 100;
        remainSize--;
        remainMoney -= money;
        return (int) Math.round(money);
//        return money;
    }
    
    public static void main(String[] args) {
        

        int remainSize = 36; //
        double remainMoney = 650; 
        int[] s = new int[72];
        
        for (int i = 0; i < 36; i++) {
            int money = getmoney(remainSize,remainMoney);
//            System.out.println(money);
            s[i] = money;
        }
        
        for (int i = 0; i < remainSize; i++) {
            int money = getmoney(remainSize,remainMoney);
//            System.out.println(money);
            s[i] = money;
        }
        
//        Arrays.sort(s);
        for (int i = 36; i < 72; i++) {
            int money = getmoney(remainSize,remainMoney);
            s[i] = money;
        }
        
        Arrays.sort(s);


        for (int i = 0; i < 72; i++) {
            System.out.print(s[i]+",");
        }
        System.out.println("---sum--");
        int sum = 0;  
        for (int i = 0; i < 72; i++) {  
            sum = (int) (sum + s[i]);           // 每个元素值累加  
        }  
        System.out.println(sum);
    }
}
