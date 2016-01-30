package commonlibrary.comparademo;

/**
 * @author lfj  2015年8月22日
 * @Description: 定义学生类
 */
public class Student1 {
	private String name ;
	private int age ;
	//---
	public Student1(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public String toString() {
		return "Student1 [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
