import java.util.Arrays;
//不是一下子导入进来，用到谁导入谁！
import java.util.Date;

public class TestDemo2 {

    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println(date.getTime());
       int[] array = {1,2,3,4};
        Arrays.toString(array);
        java.util.Date date = new java.util.Date();
// 得到一个毫秒级别的时间戳
        System.out.println(date.getTime());
    }
}
