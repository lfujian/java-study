package commonlibrary.globalization;

/**
 * @author lfj  2015年8月19日
 * @Description: 测试参数传递---可变参数传递中可以接收多个对象
 */
public class InterDemo {
	public static void main(String[] args) {
		//直接传递参数
		System.out.print("第一次运行：");
		fun("haha","大毛",18);
		System.out.print("\n第二次运行：");
		fun("heihei");
		
		//使用数组传递参数
		System.out.print("\n第一次运行：");
		Object[] arg1 = {"haha","大毛",18};
		fun(arg1);
		System.out.print("第二次运行：");
		Object[] arg2 = {"haha","大毛",18};
		fun(arg2);
		System.out.print("第三次运行：");
		Object[] arg3 = {};
		fun(arg3);
	}
	public static void fun(Object...args){
		for(int i=0;i<args.length;i++){
			System.out.print(args[i]+"、");
		}
	}
}
