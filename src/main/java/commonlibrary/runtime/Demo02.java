package commonlibrary.runtime;

import java.io.IOException;

/**
 * @author lfj  2015年8月19日
 * @Description: 用 Runtime类 调用本机中的程序 并关闭程序
 */
public class Demo02 {
	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();
		Process pro = null;
		try {
			pro = run.exec("notepad.exe"); //调出记事本程序
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(3000);                  //等待三秒
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		pro.destroy();						//之后结束进程
	}
}
