   class Person{
        public String name = "gaobo";
        public int age = 18;
        public static int size;//static 修饰默认值为 0
       //静态成员变量不属于对象，size只有一份

       //没有加static 实例成员方法
        public void eat(){
            int a = 10;//局部变量在栈里面放着
            System.out.println("eat()!");
        }
        public  void sleep(){
            System.out.println("sleep()");
        }

        public static void func1(){
            System.out.println("static::func1()");
            //age  = 99;静态方法内部 不能访问非静态的数据成员
            size  = 99;
        }
        public void show(){
            System.out.println("我叫" + name +",今年" + age + "岁");
        }
    }
class Test{
    public int a;
    public static int count;
}

    public class TestDemo2 {
        public static void main(String[] args) {

        }
        public static void main5(String[] args) {
            Test t1 = new Test();
            t1.a++;
            Test.count++;
            System.out.println(t1.a);
            System.out.println(Test.count);
            System.out.println("================");
            Test t2 = new Test();
            t2.a++;
            Test.count++;
            System.out.println(t2.a);
            System.out.println(Test.count);
        }
        /*public static void main4(String[] args) {
            Person per = new Person();
            *//*per.eat();
            per.sleep();*//*
            //Person.func1();
            per.show();
            per.name = "lkx";
            per.age = 20;
            per.show();
        }*/
/*        public static void main1(String[] args) {
            Person person1 = new Person();
            Person person2 = new Person();
            Person person3 = new Person();
            Person person4 = new Person();
        }
        public static void main2(String[] args) {
            Person per = new Person();
            System.out.println(per.name);
            System.out.println(per.age);

        }*/
        /*public static void main3(String[] args) {
           *//* Person per = new Person();
            System.out.println(per.name);*//*
            System.out.println(Person.size);//类名.静态成员
        }*/
    }
