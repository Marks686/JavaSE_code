import java.util.*;
class Student1{
    private String name;
    private int age;

    //构造方法
    public Student1(){
        System.out.println("I am student init()");
    }
    //实列代码块
    {
        this.name = "bit";
        this.age = 12;
        System.out.println("I am instance init()");
    }
    public void show(){
        System.out.println("name:"+name+" age:"+age);
    }
}

class Student{
    private String name;
    private int age;
    private static String classRoom;

    //实列代码块
    {
        this.name = "bit";
        this.age = 12;
        System.out.println("I am instance init()");
    }
    //静态代码块
    static{
        classRoom="bit191";
        System.out.println("I am static init()");
    }
    //构造方法
    public Student(){
        System.out.println("I am student init()");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}//结论：静态代码块只会被执行一次
public class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println("=====================");
        Student stu1 = new Student();
        System.out.println(stu);
    }
}
