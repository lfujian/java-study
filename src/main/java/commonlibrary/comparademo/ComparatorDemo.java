package commonlibrary.comparademo;

/**
 * @author lfj  2015年8月22日
 * @Description: 为对象数组进行排序
 */
public class ComparatorDemo {
	public static void main(String[] args) {
		Student1 stu[] = { new Student1("张三", 20),
				new Student1("李四", 18), new Student1("王五", 21),
				new Student1("赵六", 20), new Student1("孙七", 22) };
		java.util.Arrays.sort(stu,new Student1Comparator()); //排序，指定排序规则
		
		for (int i = 0; i < stu.length; i++) {   // 输出数组中的内容
			System.out.println(stu[i]);
		}
	}
}
