package commonlibrary.system;

/**
 * @author lfj  2015��8��20��
 * @Description: ����һ�������ִ��ʱ��---System.currentTimeMillis()
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
		System.out.println("���������ѵ�ʱ��"+(enfTime-startTime)+"����");
	}
}
