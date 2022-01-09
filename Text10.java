package com.itheima;

import java.util.Scanner;

public class Text10 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);

        for (int x=0; x<arr.length; x++) {
            System.out.println("请输入第" + (x + 1) + "个评委的打分");
            arr [x] = sc.nextInt();
        }
        int max = getMax(arr);
        int min = getMin(arr);
        int sum = getSum(arr);
        int average = (sum - max - min) / (arr.length - 2);
        System.out.println("六位评委给出分数的平均值是：" +average );

    }
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int x=1; x<arr.length; x++) {
           if (arr[x]>max) {
               max = arr[x];
           }
        }
        return max;
    }
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int x=1; x<arr.length; x++) {
            if (arr[x]<min) {
                min = arr[x];
            }
        }
        return min;
    }
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int x=0; x<arr.length; x++) {
                sum += arr[x];
        }
        return sum;
    }
}
