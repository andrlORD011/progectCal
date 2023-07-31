package Algorithms;

import java.util.Arrays;

public class SortirovkaSliyan {
    public static void main(String[] args) {

        int [] arr3 = {3,5,7,1,2,4,9,3,10,88,53};
        int [] arr = sortarr(arr3);
        System.out.println(Arrays.toString(arr));


    }

    public static int [] sortarr (int[] arr) {
        if ( arr == null){
            System.out.println("Massiv pust");
            return null;
        }
        if ( arr.length< 2){
            return arr;
        }
        int [] left = new int[arr.length/2];
        int [] right = new  int [arr.length - arr.length/2];
        System.arraycopy(arr,0,left,0,arr.length/2);
        System.arraycopy(arr,arr.length/2,right,0,arr.length - arr.length/2);
        left = sortarr(left);
        right = sortarr(right);
        return merge(left,right);

    }

    public static int[] merge(int[] a, int[] b) {
        int[] res = new int[a.length + b.length]; // указываем длинну массива

        int firstLenght = a.length; // переменная длинна масива
        int secondLenght = b.length; // переменная длинна масива

        int i = 0, j = 0, k = 0; // i - указатель на конкретный элимент  массива А , J- указатель массива Б, К - по rec array

        while (i < firstLenght && j < secondLenght) {  // обрабатывает два массива одинаковой длинны
            if (a[i] <= b[j]) {
                res[k] = a[i];
                i++;
            } else {
                res[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < firstLenght) {
            res[k] = a[i];
            i++;
            k++;
        }

        while (j < secondLenght) {
            res[k] = b[j];
            j++;
            k++;
        }
        return res;
    }

}

