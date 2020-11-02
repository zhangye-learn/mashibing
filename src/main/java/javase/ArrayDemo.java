package javase;

import java.lang.reflect.Array;

/*
数组表示存储相同数据类型的有序集合
    特点：
        1、数组中存放的数据类型必须是同一个数据类型，可以是基本类型也可以是引用类型
        2、数组在定义的时候必须给定大小，且大于不可改变
        3、可以通过下标值来获取数据，下表从0开始
        4、插入数组中的数据是有序集合，此时有序并不是指代大小排序，二而是指插入的顺序
    使用：
        1、声明数组
        2、创建空间
        3、赋值
        4、数组操作
* */
public class ArrayDemo {

    public static void main(String[] args) {
        //生命数组
        int[] array;
        //创建内存空间
        array = new int[5];
        //数组赋值
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        array[4] = 4;
        System.out.println(array[0]);

        int[] arr = new int[5];
        int[] arr1 = new int[]{1, 2, 3 ,4 ,5};

        System.out.println(arr.length);

        //输入5个数值，求平均值
        int[] arr6 = new int[] {56,98,48,89, 100};
        int sum = 0;
        for (int i = 0;i< arr6.length;i++){
            sum += arr6[i];
        }
        System.out.println("平均值：" + sum/5);

    }
}
