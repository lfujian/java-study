package commonlibrary.numberdemo;

import java.text.DecimalFormat;

/**
 * @author lfj  2015年8月21日
 * @Description: 格式化数据  (必须用#或者0)---DecimalFormat 格式化数字，以自定义的方式
 */
public class Demo02 {
	public static void main(String[] args) {
		FormatDemo demo = new FormatDemo();
		demo.format1("###,###.###", 111222.34567);  //普通
		demo.format1("000,000.000",11222.34567);			//补零
		demo.format1("###,###.###￥", 111222.34567);  //加字符
		demo.format1("000,000.000￥",11222.34567);
		demo.format1("##.###%", 0.345678);			//百分显示
		demo.format1("00.000%", 0.345678);
		demo.format1("###.###\u2030", 0.345678);		//千分显示
	}
}

class FormatDemo{
	public void format1(String pattern,double value){
		DecimalFormat df = null;
		df  = new DecimalFormat(pattern);
		String str = df.format(value);
		System.out.println("使用"+pattern+"格式化数字"+value+"--"+str);
	}
	
}