package io.serdemo;

import java.io.Serializable;

/**
 * 对象序列化 --- 把一个对象变为二进制的数据流的一种方式 --- 实现对象的传输或存储
 * @author lfj  2015年12月19日
 * @Description: 定义可序列化的类
 */
public class Person implements Serializable {
    
    private static final long serialVersionUID = 1L; // 确保序列化与反序列号jdk版本兼容
    
    private String name;
    private int age;
    public Person(String name,int age) {  // 通过构造方法设置属性内容
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return "姓名：" + this.name + ";年龄：" + this.age;
    }
}
