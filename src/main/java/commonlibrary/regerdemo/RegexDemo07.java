package commonlibrary.regerdemo;

/**
 * @author lfj  2015年8月28日
 * @Description: 一些敏感字符操作时需要转义---对正则进行转义
 */
public class RegexDemo07 {
	public static void main(String[] args) {
		String info = "LFJ:16|TXDY:6|Lee:6";
		String s[] = info.split("\\|");          //此处需加"\\"转义         s[] = {"LFJ:16","TXDY:66","LI:888"}
		System.out.println("字符串的拆分：");
		for (int x=0;x<s.length;x++) {
			String s2[] = s[x].split(":");
			System.out.println("\t|- "+s2[0]+"\t"+s2[1]);
		}
	}
}
