package Inichializaciya;

public class StaticExmpl {
 public static int[] arraymerg ( int[] a , int [] b){
     int [] rec = new int[a.length + b.length];
     int one = a.length;
     int two = b.length;

     int a1 = 0, b1 = 0, k=0;

     while (a1 < a.length && b1 < b.length){
         if( a[a1] <= b[b1]){
             rec[k] = a[a1];
             a1++;
         }else {
             rec[k] = b[b1];
             b1++;
         }
         k++;

     }
     while (a1 < one){
         rec[k] = a[a1];
         a1++;
         k++;
     }
     while ( b1 < two){
         rec[k] = b[b1];
         b1++;
         k++;
     }
     return rec;

 }
}
