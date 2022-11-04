//封装就是用private修饰方法
class Student{
    private String MyName;
    private int age;

    public String getMyName() {
        return MyName;
    }

    public void setMyName(String myName) {
        MyName = myName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//提供一个公开的接口
    /*public String getMyName(){
        return this.MyName;
    }
    public void setMyName(String MyName){
        this.MyName = MyName;//this代表当前对象的引用
    }*/


    private void func1(){
        System.out.println("func1()");
    }

    public void show(){
        System.out.println("我叫" + this.MyName + ",今年" + this.age + "岁");
    }

    @Override   //这个方法是重新写的
    public String toString() {
        return "Student{" +
                "我叫'" + MyName + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TestDemo3 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setMyName("gaobo");
        String str = student.getMyName();
        System.out.println(str);

        //student.show();
        System.out.println(student);
        int i = 1;
        i += ++i;
        System.out.println(i);
        boolean x=true;
        boolean y=false;
        short z=42;
        if((z++==42)&&(y=true))
            z++;
        if((x=false)||(++z==45))
        System.out.println("z="+z);
        int num=0;
        for (int b=0;b<100;b++) {
            num=num++;
        }
        System.out.println("num="+num);
    }
}
