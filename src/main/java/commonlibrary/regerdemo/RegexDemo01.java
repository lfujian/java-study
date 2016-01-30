package commonlibrary.regerdemo;

/**
 * @author lfj  2015年8月27日
 * @Description: 正则表达式---不使用正则表达式，传统方法判断字符串是否由数字组成
 */
public class RegexDemo01 {
	public static void main(String[] args) {
		String str = "1234567890";
		boolean flag = true; //设置标志位
		char c[] = str.toCharArray(); //将字符串变成字符数组
		for (int i = 0; i < c.length; i++) {
			if (c[i]<'0' || c[i]>'9') { // 或 ||
				flag = false; 
				break ;
			}
		}
		if (flag) {
			System.out.println("是由数字组成");
		} else {
			System.out.println("不是由数字组成");
		}
	}

}
