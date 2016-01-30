package commonlibrary.system;

/**
 * @author lfj  2015年8月20日
 * @Description: 计算一个程序的执行时间---System.currentTimeMillis()
 */
public class Demo01 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		int sum = 0;
		for(int i = 0;i<300000000;i++){
			sum += i;
		}
		System.out.println(sum);
		long enfTime = System.currentTimeMillis();
		System.out.println("计算所花费的时间"+(enfTime-startTime)+"毫秒");
	}
}
