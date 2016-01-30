package commonlibrary.stringbuffer;

/**
 * @author lfj  2015年8月19日
 * @Description: StringBuffer---append
 */
public class Demo01 {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		buf.append("hello ");
		buf.append("world").append("!!!");
		buf.append("\n");
		buf.append("数字 = ").append(1).append("\n");
		buf.append("字符 = ").append('C').append("\n");//代码链的操作形式
		buf.append("布尔 = ").append(true);
		System.out.println(buf);
	}
}
