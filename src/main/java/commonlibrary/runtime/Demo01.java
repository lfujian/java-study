package commonlibrary.runtime;

/**
 * @author lfj  2015��8��19��
 * @Description: �鿴JVM���ڴ�ռ� || �������� gc
 */
public class Demo01 {
	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();
		System.out.println("JVM����ڴ�����"+run.maxMemory());
		System.out.println("JVM�����ڴ���"+run.freeMemory());
		
		String str = "Hello"+"World"+"������"+"\t"+"heihei";
		System.out.println(str);
		for(int i=0;i<1000;i++){
			str+=i;
		}
		System.out.println("����String֮���JVM�����ڴ���"+run.freeMemory());
		run.gc();
		System.out.println("��������֮���JVM�����ڴ���"+run.freeMemory());
	}
}
