package commonlibrary.stringbuffer;

/**
 * @author lfj  2015年8月19日
 * @Description: StringBuffer---内容可修改
 */
public class Demo02 {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		buf.append("hello ");
		fun(buf);
		System.out.println(buf);
	}
	public static void fun(StringBuffer s){
		s.append("CXY-").append("老李");
	}
}
