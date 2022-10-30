import java.util.Arrays;

public class TestDemo1 {
    public static void main1(String[] args) {
        int array[][] = {{1,2,3},{4,5,6}};
        for(int i = 0; i< array.length; i++){
            for(int j = 0; j< array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main2(String[] args) {
        int array[][] = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(array));
    }

    public static void main3(String[] args) {
        int array[][] = {{1,2,3},{4,5,6}};
        for (int[] tmp : array) {
            for (int x: tmp) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int array[] = {1,2,1,3,4,3,4};
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            tmp ^= array[i];
        }
        System.out.println(tmp);
    }
}
