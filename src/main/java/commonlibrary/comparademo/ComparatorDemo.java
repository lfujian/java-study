package commonlibrary.comparademo;

/**
 * @author lfj  2015��8��22��
 * @Description: Ϊ���������������
 */
public class ComparatorDemo {
	public static void main(String[] args) {
		Student1 stu[] = { new Student1("����", 20),
				new Student1("����", 18), new Student1("����", 21),
				new Student1("����", 20), new Student1("����", 22) };
		java.util.Arrays.sort(stu,new Student1Comparator()); //����ָ���������
		
		for (int i = 0; i < stu.length; i++) {   // ��������е�����
			System.out.println(stu[i]);
		}
	}
}
