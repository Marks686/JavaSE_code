import Demo1.Test;

class Person{
    private String name;

    private int age;

    String sex;//默认是default权限：默认权限

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show(){
        System.out.println("姓名："+name+"年龄："+age);
    }
}

public class TestDemo1 {
    public static void main(String[] args) {
//        Test test = new Test();
//        System.out.println(test.a);
    }
    public static void main1(String[] args) {
        Person person = new Person();
        //person.name = "bit";
        person.setName("bit");
        System.out.println(person.getName());
    }
}
