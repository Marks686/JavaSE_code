/*class A {
    int a = 11;
    int b = 12;

    public void print() {
        System.out.println(a + " " + b);
    }
}

class B extends A {
    int a = 20;

    public void print() {
        System.out.println(a + " " + b);
    }
}*/
/*
class A {
    double f(double x, double y) {
        return x * y;
    }
}

class B extends A {
    double f(double x, double y) {
        return x + y;
    }
}

public class Test {
    public static void main(String[] args) {
*/
/*                A aObj = new A();
                aObj.print();
                B bObj = new B();
                bObj.print();*//*

        A obj = new B();
        System.out.println(obj.f(4, 6));
    }
}
*/
import java.util.Scanner;
class Student {
    int id;
    String name;
    int age;
    public Student(int id,String name,int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }



}
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student(sc.nextInt(),sc.next(),sc.nextInt());
        Student s2 = new Student(sc.nextInt(),sc.next(),sc.nextInt());
        System.out.println(s1.equals(s2));
        sc.close();
    }
}
