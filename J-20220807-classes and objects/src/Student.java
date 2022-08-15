public class Student {
    public String name;
    public int age;


    Student(){
        System.out.println("带参数的构造方法");
    }

    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void setStudent(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void print(){
        System.out.println(this.name+" => "+this.age );
    }

    public static void main(String[] args) {
         Student student = new Student();
         student.setStudent("bit",12);
         student.print();
    }
}
