package commonlibrary.runtime;

/**
 * @author lfj  2015年8月19日
 * @Description: 查看JVM的内存空间 || 垃圾回收 gc
 */
public class Demo01 {
	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();
		System.out.println("JVM最大内存量："+run.maxMemory());
		System.out.println("JVM空闲内存量"+run.freeMemory());
		
		String str = "Hello"+"World"+"！！！"+"\t"+"heihei";
		System.out.println(str);
		for(int i=0;i<1000;i++){
			str+=i;
		}
		System.out.println("操作String之后的JVM空闲内存量"+run.freeMemory());
		run.gc();
		System.out.println("垃圾回收之后的JVM空闲内存量"+run.freeMemory());
	}
}
