package commonlibrary.system;

/**
 * @author lfj  2015年8月20日
 * @Description: 观察对象释放
 */
public class Demo03 {
	public static void main(String[] args) {
		Person per = new Person("老李",22);
		System.out.println(per.toString());
		per = null;  //断开引用，释放空间
		System.gc();  //强制性施放空间
	}
}

class Person {
	private String name;
	private int age;
	//--
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return "姓名："+this.name+",年龄"+this.age;
	}
	public void finalize() throws Throwable { //对象释放空间时默认调用此方法
		System.out.println("对象被释放-->"+this);
	}
}