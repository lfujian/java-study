package commonlibrary.stringbuffer;

/**
 * @author lfj  2015年8月19日
 * @Description: StringBuffer---字符串反转reverse || 替换-replace||截取-substring ||删除-delete ||查找-indexOf ||
 */
public class Demo04 {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		buf.append("world！！");
		buf.insert(0, "hello ");
		String str = buf.reverse().toString();
		System.out.println("字符串反转："+str);
		
		//替换指定范围的内容
		StringBuffer buf1 = new StringBuffer();
		buf1.append("123456old9Hello");
		buf1.replace(6, 9, "new");
		System.out.println("字符串替换："+buf1);
		
		//字符串截取
		StringBuffer buf2 = new StringBuffer();
		buf2.append("123456old9Hello");
		String str1 = buf2.substring(6,9);
		System.out.println("字符串截取："+str1);
		
		//字符串删除
		StringBuffer buf3 = new StringBuffer();
		buf3.append("123456old9Hello");
		String str2 = buf3.delete(6,9).toString();//必须转成字符串
		System.out.println("字符串截取："+str2);
		
		//字符串查找
		StringBuffer buf4 = new StringBuffer();
		buf4.append("123456old9Hello");
		if(buf4.indexOf("old")==-1){    //没有找到则返回-1
			System.out.println("没有找到指定内容");
		}else{
			System.out.println("存在指定内容");
		}
	}
}
