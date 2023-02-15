
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
import java.util.*;
public class Test {
    public int hashCode() {
        return 1;
    }
    public boolean equals(Object b) {
        return true;
    }
    public static void main(String args[]) {
        Set set = new HashSet();
        set.add(new Test());
        set.add(new String("ABC"));
        set.add(new Test());
        System.out.println(set.size());
    }
}

