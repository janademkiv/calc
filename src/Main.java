import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static int [] arrayInt = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args)throws IOException {
//        for (int i = 1;i<259;i++) {
//            System.out.println("i="+i+" -> "+RomanNumerals(i));
//        }

        //System.out.println( RomanNumerals(300));

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число a + b");
        String s = reader.readLine();
        int a = 0;
        int b = 0;
        int c = 0;
        int y = 0;
        String d = s.replace(" ","");
        d.split("+");
        for (int i = 0; i < d.length(); i++) {
            System.out.println(d.charAt(i));

        }

        int h = 0;
        String newIntA = "";
        for (int i = 0; i < d.length(); i++) {
            if (d.charAt(i) -'0' == h) {
                newIntA +=d.charAt(i)-'0';
            } else {
                h++;
            }

        }
        System.out.println("Новая строка");
        System.out.println(newIntA);
        //System.out.println("метод replace");
        // System.out.println(s.replace(" ",""));

//        if (s.equals("+")){
//            System.out.print("Ответ: ");
//            System.out.println(answerInt(a,b));
//        }
    }

    public static int answerInt(int a, int b){

        return a + b;
    }
//    public static String RomanNumerals(int Int) {
//        LinkedHashMap<String, Integer> roman_numerals = new LinkedHashMap<String, Integer>();
//        roman_numerals.put("M", 1000);
//        roman_numerals.put("CM", 900);
//        roman_numerals.put("D", 500);
//        roman_numerals.put("CD", 400);
//        roman_numerals.put("C", 100);
//        roman_numerals.put("XC", 90);
//        roman_numerals.put("L", 50);
//        roman_numerals.put("XL", 40);
//        roman_numerals.put("X", 10);
//        roman_numerals.put("IX", 9);
//        roman_numerals.put("V", 5);
//        roman_numerals.put("IV", 4);
//        roman_numerals.put("I", 1);
//        String res = "";
//        for(Map.Entry<String, Integer> entry : roman_numerals.entrySet()){
//            int matches = Int/entry.getValue();
//            res += repeat(entry.getKey(), matches);
//            Int = Int % entry.getValue();
//        }
//        return res;
//    }
//    public static String repeat(String s, int n) {
//        if(s == null) {
//            return null;
//        }
//        final StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < n; i++) {
//            sb.append(s);
//        }
//        return sb.toString();
//    }
}
