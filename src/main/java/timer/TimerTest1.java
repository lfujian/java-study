package timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author lfj  2017年5月15日
 * @Description: 一个Timer 多个任务 会怎样
 */
public class TimerTest1 {
    
    private static Timer commonDailyTimer = new Timer();
    private static Timer commonDailyTime1 = new Timer();
    
    public static void main(String[] args) {
        commonDailyTime1.schedule(new Task01(), 1 *1000l, 1000l);
        commonDailyTimer.schedule(new Task02(), 2 *1000l, 1000l);
        commonDailyTimer.schedule(new Task03(), 3 *1000l, 1000l);
        commonDailyTimer.schedule(new Task04(), 4 *1000l, 1000l);
        
    }
}    

    class Task02 extends TimerTask {

        @Override
        public void run() {
            System.out.println("=======222222222222======"+new Date()+"==="+Thread.currentThread());
        }
        
    }
    class Task03 extends TimerTask {

        @Override
        public void run() {
            try {
                String s = "sss";
                int i = Integer.valueOf(s);
                System.out.println(i);
                
            } catch (Exception e){
                System.out.println(e);
            }
            System.out.println("=======33333333333333======"+new Date()+"==="+Thread.currentThread());
        }
        
    }
    class Task04 extends TimerTask {

        @Override
        public void run() {
            System.out.println("=======444444444444======"+new Date()+"==="+Thread.currentThread());
        }
        
    }


class Task01 extends TimerTask {

    @Override
    public void run() {
        System.out.println("=======1111111111111======"+new Date()+"==="+Thread.currentThread());
    }
    
}


/* 当在一个Timer 中
 * 结论
 *   1.他们全在一个线程中，一旦有未捕获异常，所有的定时任务全都会崩掉。
 * 
 */





