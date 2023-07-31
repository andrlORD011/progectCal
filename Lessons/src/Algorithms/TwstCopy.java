package Algorithms;

import java.util.Arrays;

public class TwstCopy {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = new int[arr1.length];
        System.arraycopy(arr1,0,arr2,0,arr1.length); // с какого массива, с какого элимента  в какой массив , с какой позиции, какая длинна
        System.out.println(Arrays.toString(arr2));

    }

    public static void copy(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];

        }
    }
}
