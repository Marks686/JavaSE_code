import java.sql.SQLOutput;

/*
class Person{
    public String name = "gaobo";
    public int age = 18;
    public static int size = 10;
    public void eat(){
        System.out.println("eat()!");
    }
    public  void sleep(){
        System.out.println("sleep()");
    }
}
public class TestDemo2 {
    public static void main1(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
    }

    public static void main2(String[] args) {
        Person per = new Person();
        System.out.println(per.name);
        System.out.println(per.age);
    }

    public static void main3(String[] args) {
        String s0 = new String("hello,中国!");

        System.out.println(s0.length());
        int x=10,y=20,z=30;
        int a = x > y ? (x > z ? x : y) : (y > z ? y : z);
        System.out.println(a);

        String str = "exciting";

        System.out.println("value is " + (("EXCiting".equalsIgnoreCase(str)) ? 88 : 77));
    }
*/
/*
public class Test {

    int x, y;
}
    Test(int x, int y) {

        this.x = x;

        this.y = y;

    }

public class TestDemo2 {
    public static void main(String[] args) {
        Test pt1, pt2;

        pt1 = new Test(3, 3);

        pt2 = new Test(4, 4);

        System.out.print(pt1.x + pt2.x);
    }

}*/

public class TestDemo2 {

    int x, y;

    TestDemo2(int x, int y) {

        this.x = x;

        this.y = y;

    }

    public static void main(String[] args) {

        TestDemo2 pt1, pt2;

        pt1 = new TestDemo2(3, 3);

        pt2 = new TestDemo2(4, 4);

        System.out.print(pt1.x + pt2.x);

    }

}
