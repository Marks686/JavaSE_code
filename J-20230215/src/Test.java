
/*public class Test {
    *//*public int getValue(int i){
        int result=0;
        switch(i){
            case 1:
                result=result+i;
            case 2:
                result=result+i*2;
            case 3:
                result=result+i*3;
        }
        return result;
    }*//*
    *//*public static void main(String[] args) {
        int result = 0;
        int i = 2;
        switch (i) {
            case 1:
                result = result + i;
            case 2:
                result = result + i * 2;
            case 3:
                result = result + i * 3;
        }
        System.out.println(result);
    }*//*

}*/

/*class A {
    public A() {
        System.out.println("The default constructor of A is invoked");
    }
}

class B extends A {
    public B() {
        System.out.println("The default constructor of B is invoked");
    }
}

public class Test  {
    public int hashCode() {
        return 1;
    }
    public boolean equals(Object b) {
        return true;
    }
    public static void main(String[] args) {
        //B b = new B();


            Set set = new HashSet();
            set.add(new Test());
            set.add(new String("ABC"));
            set.add(new Test());
            System.out.println(set.size());

    }
}*/

/*import java.util.*;
public class Test {

    public static void main(String[] args) {
        double s=0;
        Scanner sc=new Scanner(System.in);
        double r1,r2;
        r1=sc.nextDouble();
        r2=sc.nextDouble();
        Circle c1=new Circle(r1);
        Circle c2=new Circle(r2);
        try{
            s = c1.area();
            System.out.println(s);
            s = c2.area();
            System.out.println(s);
        }
        catch (CircleException e){
            e.print();
        }
    }
}
class Circle{
    double r;
    public Circle(double r){
        this.r=r;
    }
    public double area() throws CircleException{
        if(r<0){
            throw new CircleException(r);

        }
        return 3.14*r*r;
    }
}
class CircleException extends Exception{
    double r;
    public CircleException(double r){
        this.r =r;
    }
    public void print(){
        System.out.println("圆半径"+r+"不合理");
    }
}*/
/* 请在这里填写答案 编写Circle 和CircleException类*/


/*import java.util.Scanner;
public class Test{
    public static void main(String[] args) {
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
    }
}
class Person{
    String name;
    String sex;
    int age;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setSex(String sex){
        this.sex=sex;
    }
    public String getSex(){
        return sex;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void print(){
        System.out.println("name:"+name+"; sex:"+sex+"; age:"+age);
    }
}*/


import java.util.Scanner;

public class Test {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("numberOfObjects=" + StudentOf2019EE.getNumberOfObjects() + ",clazzMoney=" + StudentOf2019EE.getClazzMoney());

        StudentOf2019EE a = new StudentOf2019EE("Tom");
        StudentOf2019EE b = new StudentOf2019EE("Jerry", 200);
        StudentOf2019EE c = a;

        a.payClazzMoney(input.nextInt());
        System.out.println("numberOfObjects=" + StudentOf2019EE.getNumberOfObjects() + ",clazzMoney=" + StudentOf2019EE.getClazzMoney());

        b.payClazzMoney(input.nextInt());
        System.out.println("numberOfObjects=" + StudentOf2019EE.getNumberOfObjects() + ",clazzMoney=" + StudentOf2019EE.getClazzMoney());

        c.payClazzMoney(input.nextInt());
        System.out.println("numberOfObjects=" + StudentOf2019EE.getNumberOfObjects() + ",clazzMoney=" + StudentOf2019EE.getClazzMoney());

        StudentOf2019EE.clazzActivity(input.nextInt());
        System.out.println("numberOfObjects=" + StudentOf2019EE.getNumberOfObjects() + ",clazzMoney=" + StudentOf2019EE.getClazzMoney());
    }
}

/* 请在这里填写答案 */





/* 你的代码被嵌在这里 */
class StudentOf2019EE{
    private String name;
    private int money;
    private static int numberOfObjects=0;
    private static int clazzMoney=0;
    public void StudentOf2019EE(String name){
        this.name = name;
        money = 100;
        numberOfObjects++;
    }
    public void StudentOf2019EE(String name, int money){
        this.name = name;
        this.money = money;
        numberOfObjects++;
    }
    public String getName(){
        return name;
    }
    public int getMoney(){
        return money;
    }
    public void payClazzMoney(int amount){
        if(getMoney() < amount){
            clazzMoney += getMoney();
            money = 0;
        }
        else{
            clazzMoney += amount;
            money -= amount;
        }
    }
    public static void clazzActivity(int amount){
        if(clazzMoney<amount){
            clazzMoney -= clazzMoney;
        }
        else{
            clazzMoney -= amount;
        }
    }
    public static int getNumberOfObjects(){
        return numberOfObjects;
    }
    public static int getClazzMoney(){
        return clazzMoney;
    }
}