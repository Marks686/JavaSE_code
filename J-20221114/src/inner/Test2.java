package inner;


class OuterClass2{
    public int data1 = 1;
    int data2 = 2;
    public static int data3 = 3;

    public void test(){
        System.out.println("out::test()");
    }
    static class InnerClass2{
        public int data4 = 4;
        int data5 = 5;
        public static int data6 = 6;
        public void func(){
            System.out.println("out::func()");
//            System.out.println(data1);
//            System.out.println(data2);
            System.out.println(data3);
            System.out.println(data4);
            System.out.println(data5);
            System.out.println(data6);
        }
    }
}
class Person{
    public int age;
    public String name;

    @Override
    public String toString() {
//        return "Person{" +
//                "age=" + age +
//                ", name='" + name + '\'' +
//                '}';
        return "姓名："+ name +"年龄："+age;
    }
}

public class Test2 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person);
    }
//    public static void main(String[] args) {
//        Person person = new Person();
//        System.out.println(person.age);
//        System.out.println(person.name);
//        new Person();
//        System.out.println(new Person().age);//匿名对象
//        System.out.println(new Person().name);//匿名对象 只能用一次
//
//
//        //匿名内部类
//        new Person(){
//
//        };
//    }
//    public void func(){
//        //局部内部类：
//        class Inner{
//            public void test(){
//                System.out.println("11111");
//            }
//        }
//        Inner inner = new Inner();
//        inner.test();
//    }
//    public static void main2(String[] args) {
//        //OuterClass2.InnerClass2 innerClass2 = new OuterClass2.InnerClass2();
//    //OuterClass2 out = new OuterClass2();
//     new OuterClass2();//匿名对象
//    }
}
