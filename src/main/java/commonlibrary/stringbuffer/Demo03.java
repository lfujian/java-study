package commonlibrary.stringbuffer;

/**
 * @author lfj  2015年8月19日
 * @Description: StringBuffer---内容可修改---insert
 */
public class Demo03 {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		buf.append("world! ");
		buf.insert(0, "hello "); //在指定位置处插入，此处在最前
		System.out.println(buf);
		buf.insert(buf.length(), "hehe~~");
		System.out.println(buf);
	}
}
