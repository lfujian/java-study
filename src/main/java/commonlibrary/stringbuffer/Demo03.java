package commonlibrary.stringbuffer;

/**
 * @author lfj  2015��8��19��
 * @Description: StringBuffer---���ݿ��޸�---insert
 */
public class Demo03 {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		buf.append("world! ");
		buf.insert(0, "hello "); //��ָ��λ�ô����룬�˴�����ǰ
		System.out.println(buf);
		buf.insert(buf.length(), "hehe~~");
		System.out.println(buf);
	}
}
