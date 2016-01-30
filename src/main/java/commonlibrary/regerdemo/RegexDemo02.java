package commonlibrary.regerdemo;

import java.util.regex.Pattern; //进行正则规范的编写  Matcher-执行规范，验证一个字符串是否符合起规范 matches() replaceAll()
												//compile()指定正则表达式   matcher()返回Matcher类实例   split()字符串拆分
/**
 * @author lfj  2015年8月27日
 * @Description: 正则表达式---判断字符串是否由数字组成
 */
public class RegexDemo02 {
	public static void main(String[] args) {
		String str = "1234567890";
		if (Pattern.compile("[0-9]+").matcher(str).matches()) { //"[0-9]+" 表示由一个以上的数字组成
			System.out.println("是由数字组成");
		} else {
			System.out.println("不是由数字组成");
		}
	}
}
// 常用正则规范
//-- `\\` -- `\`	`\t`--`制表符`		`\n`--`换行`	`[abc]`--`字符ab或c`		`[a-zA-Z0-9]`--`表示由字母数字组成`		`\d`--`表示数字` 
//-- `\D`--`表示非数字`		`\w`--`表示字母、数字、下划线`		`\W`--`表示非字母、数字、下划线`
//-- `\s`--`表示所有空白字符`		`\S`--`表示所有非空白字符`	`^`--`行的开头`		`$`--`行的结尾`
//-- `.`--`匹配换行符之外的任意字符`
// 数量表示（X表示一组规范）
//-- `X`--`必须出现一次`	`X?`--`可以出现0次或一次`		`X*`--`可以出现任意次`		`X+`--`可以出现一次或多次`
//-- `X{n}`--`必须出现n次`		`X{n,}`--`必须出现n次以上`		`X{n,m}`--`必须出现n~m次`
// 逻辑运算符（X、Y表示一组规范）
//-- `XY`--`X规范后跟着Y规范`	`X|Y`--`X规范或Y规范`	`(X)`--`作为一个捕获组规范`


