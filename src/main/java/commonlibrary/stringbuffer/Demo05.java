package commonlibrary.stringbuffer;

/**
 * @author lfj  2015年8月19日
 * @Description: StringBuffer---频繁修改内容---
 */
public class Demo05 {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		buf.append("laoli");
		for(int i=0;i<50;i++){
			buf.append(i);
		}
		System.out.println(buf);
	}
}
