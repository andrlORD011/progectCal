package Lesson16;

public class Test5 {
    public static void main(String[] args) {
        String s1 = "Hallo world";
        String s2 = "yra";
        String s3 = s1.concat(s2).replace("yra","Ураа").substring(6,10);
        System.out.println(s3);

    }
}
