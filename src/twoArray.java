import java.lang.reflect.Array;
import java.util.Arrays;

/*
*
*
*                   二维数组的实现及打印
*
*
*
* */
public class twoArray {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1,2,3,},{4,5,6}};


        //第一种for循环打印
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }

        //第二种Arrays.deepToString方法
        System.out.println(Arrays.deepToString(array));
    }


}
