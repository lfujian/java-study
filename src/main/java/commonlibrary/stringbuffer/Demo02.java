package commonlibrary.stringbuffer;

/**
 * @author lfj  2015��8��19��
 * @Description: StringBuffer---���ݿ��޸�
 */
public class Demo02 {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		buf.append("hello ");
		fun(buf);
		System.out.println(buf);
	}
	public static void fun(StringBuffer s){
		s.append("CXY-").append("����");
	}
}
