package commonlibrary.task;

import java.util.Timer;//每一个Timer对象对应一个线程，有前后顺序的，前面太耽误时间，后面的就没法按时执行了

/**
 * @author lfj  2015年8月28日
 * @Description: 建立测试类，进行任务调度
 */
public class TestTask {
	public static void main(String[] args) {
		Timer t = new Timer();          //建立Timer类对象
		MyTask mt = new MyTask();//定义任务
		t.schedule(mt, 1000,2000);   //设置任务的执行，1秒后开始，每2秒重复一次
	}
}
// Timer类的常用方法
//-- t.cancel();    终止该计时器，并放弃所有已安排的任务，对当前正在执行的任务没有影响
//-- t.purge();	  将所有已经取消的任务移除，一般用来释放空间
//-- t.schedule(task, time);	time时执行task
//-- t.schedule(task, firstTime, period);	 firstTime时执行task 然后每隔period重复执行一次
//-- t.schedule(task, delay);		delay后开始执行task
//-- t.schedule(task, delay, period); delay后开始执行task time时执行task 然后每隔period重复执行一次
//-- t.scheduleAtFixedRate(task, firstTime, period); 	firstTime时执行task 然后每隔period重复执行一次
//-- t.scheduleAtFixedRate(task, delay, period);		delay后开始执行task time时执行task 然后每隔period重复执行一次
// schedule和scheduleAtFixedRate的区别
//-- schedule 执行时间间隔是永远固定的，如果之前出现了延时，之后也会按照设定好的间隔时间来执行
//-- scheduleAtFixedRate 可以根据出现的延迟时间自动调整下一次间隔的执行使劲啊





