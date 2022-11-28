import java.util.Scanner;
/*class Student {
    int id;
    String name;
    int age;
    public Student(int id,String name,int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }*/

/*    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o instanceof Student){
            Student p = (Student)o;
            return this.id == p.id;
        }else{
            return false;
        }
    }

}*/

/*
    public boolean equals(Object o){
        if( this == o){
            return true;
        }
        if(o instanceof Student){
            Student p = (Student)o;
            return this.id == p.id;
        }
        else{
            return false;
        }
    }
*/

/*    public boolean equals (Object o){
        if (this == o){
            return true;
        }
        if(o instanceof Student){
            Student p = (Student)o;
            return this.id == p.id;
        }
        else{
            return false;
        }
    }
 */
/*    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o instanceof Student){
            Student p = (Student)o;
            return this.id == p.id;

        }
        else{
            return false;
        }
    }
}*/
/*class Circle{
    double radius ;

    public Circle (double r){
        radius = r;
    }

    public double getArea( ){
        return Math.PI*radius*radius;
    }

    public double getLength(){
        return 2*Math.PI*radius;
    }
}*/

/*class Circle{
    double radius;
    public Circle (double r){
        radius = r;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getLength(){
        return Math.PI*(2*radius);
    }
}*/
/*interface IComputer{
    abstract public int computer(int n,int m);
}
class Add implements IComputer{
    int n,m;
    public int computer(int n,int m){
        return n+m;
    }
}
class Sub implements IComputer{
    int n,m;
    public int computer (int n, int m){
        return n-m;
    }
}*/
interface IComputer{
    abstract public int computer(int n,int m);
}
class Add implements IComputer{
    int n,m;
    public int computer(int n,int m){
        return n+m;
    }
}
class Sub implements IComputer{
    int n,m;
    public int computer(int n,int m){
        return n-m;
    }
}
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    }
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Add l = new Add();
        Sub j = new Sub();
        System.out.println(l.computer(n,m));
        System.out.println(j.computer(n,m));
    }*/

/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextFloat()) {
            double r = scanner.nextDouble();
            Circle c = new Circle(r);
            System.out.printf("%.2f %.2f\n", c.getArea(), c.getLength());
            c.radius = 2 * r;
            System.out.printf("%.2f %.2f\n", c.getArea(), c.getLength());
        }
    }*/
/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student(sc.nextInt(),sc.next(),sc.nextInt());
        Student s2 = new Student(sc.nextInt(),sc.next(),sc.nextInt());
        System.out.println(s1.equals(s2));
        sc.close();
    }*/
}
