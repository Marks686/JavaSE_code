import java.util.Arrays;

public class Test {
    public static void bubbleSort(int[] array){
        //i控制趟数
        for (int i = 0; i < array.length-1; i++) {
            boolean flg = false;
            //array.length-1-i优化的是每一趟比较的次数
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flg = true;
                }
            }
            if (flg == false){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {12,6,2,8,3,9,10};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
