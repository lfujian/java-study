package commonlibrary.stringbuffer;

/**
 * @author lfj  2015��8��19��
 * @Description: StringBuffer---append
 */
public class Demo01 {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		buf.append("hello ");
		buf.append("world").append("!!!");
		buf.append("\n");
		buf.append("���� = ").append(1).append("\n");
		buf.append("�ַ� = ").append('C').append("\n");//�������Ĳ�����ʽ
		buf.append("���� = ").append(true);
		System.out.println(buf);
	}
}
