package Lesson17;

public class Test1 {
    public void arra (int array[], int array2 []){

        int[] c = new int[array.length + array2.length];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            c[i] = array[i];
            count++;
        }
        for (int j = 0; j < array2.length; j++) {
            c[count++] = array2[j];

        }
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = 0; j < c.length - i - 1; j++) {
                if (c[j + 1] < c[j]){
                    int swap = c[j];
                    c[j] = c[j + 1];
                    c[j + 1 ] = swap;
                }
            }
            System.out.println(c[i]);
        }

    }

    public static void main(String[] args) {
        int[] a = {1, 5, 4, 4, 9};
        int[] b = {12, 2, 3, 6, 7};
        int[] c = new int[a.length + b.length];
        int count = 0;
        int element;

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
            count++;
        }
        for (int j = 0; j < b.length; j++) {
            c[count++] = b[j];

        }
        for (int i =  - 1; i >=1; i--) {

            }

        }

    }

