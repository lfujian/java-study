package commonlibrary.task;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

/**
 * @author lfj  2015年8月28日
 * @Description: 建立 TimerTask 的子类
 */
public class MyTask extends TimerTask { //任务调度类要继承TimerTask

	@Override
	public void run() {
		SimpleDateFormat sdf = null;
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		System.out.println("当前系统时间为："+sdf.format(new Date()));
	}
}
