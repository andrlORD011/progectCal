package Zaebal;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalcilatorMetods extends  Calcul{
    public  static void calc  (String value)  {  // сам калькулятор

        String[] val = value.split(" ");
        if (val.length != 3) {
            throw new CalculatorException("строка не является математической операцией либо не соответсвует параметрам ввода");
        }

        String oneVal = val[0];
        String symbols = val[1];
        String twoVal = val[2];

        int one ;
        int two ;
        int result =0;


        if ((!isNumeric(oneVal) && !isNumeric(twoVal)) && ((romanToInt2(oneVal) - romanToInt2(twoVal)) < 0) & (symbols.equals("-"))) {
            throw new CalculatorException("Хуй можно в минус с арабскими цифрами уходить");
        } else if ((isNumeric(oneVal) & !isNumeric(twoVal)) || (!isNumeric(oneVal) & isNumeric(twoVal)) ) {
            throw new CalculatorException("ИСпользуются разные системы исчисления ");


        } else if (isNumeric(oneVal) && isNumeric(twoVal)) {           // операция с римскими циафрами
            one = Integer.parseInt(oneVal);
            two = Integer.parseInt(twoVal);
            if(symbols.equals("+")){
                result = one + two;
                System.out.println(result);
            } else if (symbols.equals("-")) {
                System.out.println(one - two);
            } else if  (symbols.equals("/")) {
                System.out.println(one / two);
            }else if (symbols.equals("*")){
                System.out.println(one * two);
            }

        } else if (!(isNumeric(twoVal) && !(isNumeric(twoVal)))) {  // операции с арабскими
            one = romanToInt2(oneVal);
            two = romanToInt2(twoVal);
            if(symbols.equals("+")){
                result = one + two;
                System.out.println(intToRoman(result));
            } else if (symbols.equals("-")) {
                System.out.println(intToRoman(result));
            } else if  (symbols.equals("/")) {
                System.out.println(intToRoman(result));
            }else if (symbols.equals("*")){
                System.out.println(intToRoman(result));
            }
        }
    }


    public static boolean isNumeric(String str) { // метод проверки числа в строке
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
    public static String intToRoman(int num) {    // перевод римс в араб
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder roman = new StringBuilder();
        for(int i=0;i<values.length;i++)
        {
            while(num >= values[i])
            {
                num = num - values[i];
                roman.append(romanLetters[i]);
            }
        }
        return roman.toString();

    }

    public  static int romanToInt2(String s) {         // перевод араб в римс
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int end = s.length()-1;
        char [] arr = s.toCharArray();
        int arabian;
        int result = map.get(arr[end]);
        for ( int i = end -1; i >=0; i--){
            arabian = map.get(arr[i]);

            if (arabian < map.get(arr[i +1])){
                result -=arabian;
            } else {
                result += arabian;
            }
        }
        return result;
    }
}
