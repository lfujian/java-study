package commonlibrary.globalization;

/**
 * @author lfj  2015��8��19��
 * @Description: ���Բ�������---�ɱ���������п��Խ��ն������
 */
public class InterDemo {
	public static void main(String[] args) {
		//ֱ�Ӵ��ݲ���
		System.out.print("��һ�����У�");
		fun("haha","��ë",18);
		System.out.print("\n�ڶ������У�");
		fun("heihei");
		
		//ʹ�����鴫�ݲ���
		System.out.print("\n��һ�����У�");
		Object[] arg1 = {"haha","��ë",18};
		fun(arg1);
		System.out.print("�ڶ������У�");
		Object[] arg2 = {"haha","��ë",18};
		fun(arg2);
		System.out.print("���������У�");
		Object[] arg3 = {};
		fun(arg3);
	}
	public static void fun(Object...args){
		for(int i=0;i<args.length;i++){
			System.out.print(args[i]+"��");
		}
	}
}
