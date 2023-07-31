package Lesson16;

public class Test1 {
    public static void main(String[] args) {
        String s1 = new String("privet");
        int a =s1.length();
        char c1 = s1.charAt(3);
        int i1 =s1.indexOf('t');
        System.out.println(i1);
        boolean a1 = s1.startsWith("et",4); // показывает начинается ли стринг с этих символов
        System.out.println(a1);



    }

}
