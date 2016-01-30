package commonlibrary.regerdemo;

/**
 * @author lfj  2015年8月28日
 * @Description: String类对正则表达式的支持
 */
public class RegexDemo06 {
	public static void main(String[] args) {
		String str = "A1B22C333D4444E55555F".replaceAll("\\d+", "_"); //字符串替换
		boolean temp = "2015-08-28".matches("\\d{4}-\\d{2}-\\d{2}"); //字符串匹配
		String s[] = "A1B22C333D4444E55555F".split("\\d+"); //字符串操作
		System.out.println("替换："+str);
		System.out.println("匹配验证："+temp);
		System.out.print("拆分：");
		for (int i=0;i<s.length;i++) {
			System.out.print(s[i]+"\t");
		}
	}
}
