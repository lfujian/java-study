package commonlibrary.clone;

public class CloneDemo {
    public static void main(String[] args) {
        Person p1 = new Person("张三");
        Person p2 = null;
        try {
            p2 = (Person)p1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        p2.setName("李四");
        System.out.println("原始对象："+p1);
        System.out.println("克隆之后的对象："+p2);
    }
}

class Person implements Cloneable {
    private String name = null ;
    public Person(String name) {
        this.name = name;
    }
    //---
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public String toString(){
        return "姓名："+this.getName();
    }
}


