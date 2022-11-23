import java.util.*;

/*class Test1{
    public int sum(int...x){
        int y = 0;
        for(int i:x){
            y+=i;
        }
        return y;
    }
}*/

/*class Test1{
    public int sum(int...x){
        int y = 0;
        for (int i:x
             ) {
            y+=i;
        }
        return y;
    }
}*/
/*
class Rectangle{
    double length;
    double wide;

    public Rectangle(double length,double wide){
        this.length = length;
        this.wide = wide;
    }
    public double getPerimeter(){
        return (length+wide)*2;
    }
    public double getArea(){
        return (length*wide);
    }
}

class Cuboid extends Rectangle{
    double height;
    public Cuboid(double length,double wide,double height){
        super(length,wide);
        this.height = height;
    }

    @Override
    public double getPerimeter(){
        return (length + wide + height)*4;
    }

    @Override
    public double getArea(){
        return (wide*height+wide*length+height*length)*2;
    }

    public double getVolume(){
        return (height*wide*length);
    }
}*/
/*class Rectangle{
    double length;
    double wide;
    public Rectangle(double length,double wide){
        this.length = length;
        this.wide = wide;
    }
    public double getPerimeter(){
        return (length + wide)*2;
    }
    public double getArea(){
        return (length*wide);
    }
}

class Cuboid extends Rectangle{
    double height;
    public Cuboid(double length,double wide,double height){
        super(length,wide);
        this.height = height;
    }
    @Override
    public double getPerimeter(){
        return (length + wide + height)*4;
    }

    @Override
    public double getArea(){
        return (length*wide + length*height + wide*height)*2;
    }

    public double getVolume(){
        return (length*height*wide);
    }
}*/
/*class Student{
    private int id;
    private String name;
    private char sex;
    public Student(int a,String b,char c){
        id = a;
        name = b;
        sex = c;
    }
    public void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(sex);
    }
}*/

/*class Student{
    private int id;
    private String name;
    private char sex;
    public Student(int a,String b,char c){
        id = a;
        name = b;
        sex = c;
    }
    public void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(sex);
    }
}
class Rectangle{
    double width,height;
    Rectangle(double width,double height){
        this.height = height;
        this.width = width;
    }
    double getArea(){
        return width*height;
    }
    double getPerimeter(){
        return (width+height)*2;
    }
}*/
/*class Person{
    public String name;
    public String sex;
    public int age;

    public void setName(String name){
        this.name = name;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void print(){
        System.out.println("name:"+name+"; sex:"+sex+"; age:"+age);
    }
}*/
/*class Tourist{
    int age;
    void show(){
        if(age<18 || age>80){
            System.out.println("年龄为："+age+",免费");
        }else{
            System.out.println("年龄为："+age+",价格为20元");
        }
    }
}*/

public class Test {

/*    public static void main6(String[] args) {
        Scanner input = new Scanner(System.in);
        Tourist v = new Tourist();
        v.age = input.nextInt();
        v.show();
    }*/
/*    public static void main5(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        String sex = scan.next();
        int age = scan.nextInt();
        Person p = new Person();
        p.setName(name);
        p.setSex(sex);
        p.setAge(age);
        p.print();
        scan.close();
    }*/
/*    public static void main4(String[] args) {
        Scanner input = new Scanner(System.in);

        double w = input.nextDouble();
        double h = input.nextDouble();
        Rectangle myRectangle = new Rectangle(w, h);
        System.out.println(myRectangle.getArea());
        System.out.println(myRectangle.getPerimeter());
        input.close();
    }*/
/*    public static void main3(String[] args) {
        Scanner in = new Scanner(System.in);
        int id = in.nextInt();
        String name = in.next();
        char sex = in.next().charAt(0);
        Student student = new Student(id, name, sex);
        student.display();
        in.close();
    }
    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        double length = scan.nextDouble();
        double wide = scan.nextDouble();
        Rectangle r = new Rectangle(length, wide);
        System.out.printf("%.2f ", r.getPerimeter());
        System.out.printf("%.2f", r.getArea());
        System.out.println();
        length = scan.nextDouble();
        wide = scan.nextDouble();
        double height = scan.nextDouble();
        Cuboid c = new Cuboid(length, wide, height);
        System.out.printf("%.2f ", c.getPerimeter());
        System.out.printf("%.2f ", c.getArea());
        System.out.printf("%.2f", c.getVolume());
        scan.close();
    }
        public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c, d, e;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        e = in.nextInt();
        Test1 rr = new Test1();
        int dd = rr.sum(a, b, c, d, e);
        System.out.println(dd);
    }*/
}
