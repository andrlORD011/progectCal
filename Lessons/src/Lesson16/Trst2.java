package Lesson16;

public class Trst2 {
    public static void main(String[] args) {

        String s1 = new String("privet");
        String s10 = s1.substring(3,6); // присваивание новому стрингу значение С:
        System.out.println(s10);
        String s12 = s1.trim();
        System.out.println(s12); // убирает пробелы по бокам и создает новый стрин
      //  String rep = s1.replace('p','x');
       //  System.out.println(rep);
        String rep1 = s1.replace("pr","xy"); // меняет значения
        System.out.println(rep1);

        String a1 = "Privet, ";
        String a2 = "Drug";
        System.out.println(a1.concat(a2)); // concatenacia
    }
}

