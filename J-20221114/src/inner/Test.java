package inner;

class OuterClass {
    public int date1 = 1;
    int date2 = 2;
    public static int date3 = 3;

    public void test() {
        System.out.println("OuterClass::test()");
    }

    //实例内部类
    class InnerClass {
        public int date1 = 1111;

        public int date4 = 4;
        int date5 = 5;

        public static final int date6 = 6;
        public void func() {
            System.out.println("InnerClass::func()");
//            OuterClass outerClass = new OuterClass();
//            System.out.println(outerClass.date1);
            System.out.println(OuterClass.this.date1);
            System.out.println(date1);
            System.out.println(date2);
            System.out.println(date3);
            System.out.println(date4);
            System.out.println(date5);
            System.out.println(date6);

        }
    }
}
public class Test {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.func();
    }
    public static void main1(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
    }
}
