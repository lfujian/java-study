package commonlibrary.numberdemo;

import java.math.BigDecimal;

/**
 * @author lfj  2015年8月21日
 * @Description: BigDecimal类  可以进行精确的计算
 */
public class BigDecimalDemo01 {
	public static void main(String[] args) {
		System.out.println("加法操作："+MyMath.round(MyMath.add(10.345, 3.333), 1));
		System.out.println("减法操作："+MyMath.round(MyMath.sub(10.345, 3.333), 3));
		System.out.println(MyMath.mul(10.345, 3.333));
		System.out.println("乘法操作："+MyMath.round(MyMath.mul(10.345, 3.333), 3));
		System.out.println("除法操作："+(MyMath.div(10.345, 3.333,3)));
	}
}

class MyMath{
	public static double add(double d1,double d2){
		BigDecimal b1 = new BigDecimal(d1);
		BigDecimal b2 = new BigDecimal(d2);
		return b1.add(b2).doubleValue();
	}
	public static double sub(double d1,double d2){
		BigDecimal b1 = new BigDecimal(d1);
		BigDecimal b2 = new BigDecimal(d2);
		return b1.subtract(b2).doubleValue();
	}
	public static double mul(double d1,double d2){
		BigDecimal b1 = new BigDecimal(d1);
		BigDecimal b2 = new BigDecimal(d2);
		return b1.multiply(b2).doubleValue();
	}
	public static double div(double d1,double d2,int len){
		BigDecimal b1 = new BigDecimal(d1);
		BigDecimal b2 = new BigDecimal(d2);
		return b1.divide(b2,len,BigDecimal.ROUND_HALF_UP).doubleValue();
	}                                     // BigDecimal.ROUND_HALF_UP 表示进行四舍五入的操作
	public static double round(double d,int len){ //四舍五入
		BigDecimal b1 = new BigDecimal(d);
		BigDecimal b2 = new BigDecimal(1);
		return b1.divide(b2,len,BigDecimal.ROUND_HALF_UP).doubleValue();
	}
}


