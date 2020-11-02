package javase;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = new int[]{3, 4, 1, 2, 7, 5, 8, 11, 9};
        //冒泡排序
//        for (int i=0;i<array.length;i++){
//            for (int j=0;j<array.length - i- 1;j++){
//                if(array[j] > array[j+1]){
//                    int tmp = array[j];
//                    array[j] = array[j+1];
//                    array[j+1] = tmp;
//                }
//            };
//        }
        //选择排序
//        for (int i=0;i<array.length;i++){
//            for (int j=i+1;j<array.length;j++){
//                if (array[i]>array[j]){
//                    int tmp = array[i];
//                    array[i] = array[j];
//                    array[j] = tmp;
//                }
//            }
//        }
        Arrays.sort(array);

        for (int i = 0;i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
