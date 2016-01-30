package commonlibrary.comparademo;

/**
 * @author lfj  2015年8月21日
 * @Description: Integer为Comparable接口实例化
 */
public class ComparableDemo02 {
	public static void main(String[] args) {
		Comparable<Integer> com = null ;
		com = 30;
		System.out.println("内容："+com);  //实际调用的是toSting方法
	}
}
