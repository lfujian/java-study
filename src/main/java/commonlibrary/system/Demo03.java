package commonlibrary.system;

/**
 * @author lfj  2015��8��20��
 * @Description: �۲�����ͷ�
 */
public class Demo03 {
	public static void main(String[] args) {
		Person per = new Person("����",22);
		System.out.println(per.toString());
		per = null;  //�Ͽ����ã��ͷſռ�
		System.gc();  //ǿ����ʩ�ſռ�
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
		return "������"+this.name+",����"+this.age;
	}
	public void finalize() throws Throwable { //�����ͷſռ�ʱĬ�ϵ��ô˷���
		System.out.println("�����ͷ�-->"+this);
	}
}