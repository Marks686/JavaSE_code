public class Student {
    public String name;
    public int age;

    public void setStudent(String name,int age){
        this.name = name;
        this.age = age;
    }


    public Student(){
        //调用本类当中 其他的构造方法
        this("wangwu",18);
        System.out.println("不带参数的构造方法");
    }

    public Student(String name, int age){
        System.out.println("带两个参数的构造方法");
        this.name = name;
        this.age = age;
    }

    public void printStudent(){
        System.out.println(this.name+"-"+this.age);
    }


    public static void main(String[] args) {
        Student student = new Student();
        /*Student student2 = new Student("小白",19);*/
/*        student.setStudent("lihua",19);
        student.printStudent();*/
    }
}
