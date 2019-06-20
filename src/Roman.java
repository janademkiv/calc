import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Roman {
   // public static HashMap<String, Integer> romanNum = new HashMap<>();
    //объявили массив с римскими цифоами для ввода от 1 до 10
    public static String[] romanNumStr = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    //объявили массив с римскими цифоами для вывода ответа
    public static String[] romanNumAns = {"0","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX"};
    public static void main(String[] args) throws IOException {


       // System.out.println(Arrays.asList(romanNumAns).indexOf("II"));

        //ввод данных
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи строку ввида I + IV");
        String s = reader.readLine();
        //убрать все пробелы из введеной строки
        String d = s.replace(" ","");

        //проверка арифметической операции (содержит ли строка нужный символ)
        String operattion = "";
        if (s.contains("+")) {
            operattion = "\\+";
        } else if (s.contains("-")){
            operattion = "-";
        } else if (s.contains("*")) {
            operattion = "\\*";
        } else if (s.contains("/")) {
            operattion = "/";
        } else {
            System.out.println("Несоответсвующая арифметическая операция.");
        }

        //разделение строки по арифметич. знаку, добавить иф для разных арифметических знаков
        String [] parts = d.split(operattion);

        //эллемент массива parts с двумя частями введеной строки
        String s1 = parts[0];
        String s2 = parts[1];

        //объявили переменную для двух римских цифр
        int i1 = 0;
        int i2 = 0;

        //проверка содержит ли введеные строки нужные символы
        for (int i = 0; i < romanNumStr.length; i++) {
            //содержит ди строка s1 значение из массива
            if (s1.equals(romanNumStr[i])) {
                i1 = i + 1;
            }
            //содержит ди строка s2 значение из массива
            if (s2.equals(romanNumStr[i])) {
                i2 = i + 1;
            }
        }



        Main main = new Main();

        // объявили переменные и поместили туда ответ из функции арифм. чисел
        int y = main.answerInt(i1, i2);
        int ans1 = main.answerInt2(i1, i2);
        int ans2 = main.answerInt3(i1, i2);
        int u = main.answerInt4(i1, i2);

        System.out.println("Римские");
        try {
            System.out.println("Сложение");
            System.out.println("Ответ");
            System.out.println(romanNumAns[y]);
        } catch (Exception e) {
            System.out.println("Число не входит в диапозон римских цифр");
        }



        try {
            System.out.println("Умножение");
            System.out.println("Ответ");
            System.out.println(romanNumAns[ans1]);
        } catch (Exception e) {
            System.out.println("Число не входит в диапозон римских цифр");
        }


        try {
            System.out.println("Деление");
            System.out.println("Ответ");
            System.out.println(romanNumAns[ans2]);
        } catch (Exception e) {
            System.out.println("Число не входит в диапозон римских цифр");
        }
        try {

            System.out.println("Вычетание");
            System.out.println("Ответ");
            System.out.println(romanNumAns[u]);
        } catch (Exception e) {
            System.out.println("Число не входит в диапозон римских цифр");
        }


//        for (int i = 0; i < romanNumAns.length; i++) {
//            if(y - 1 == romanNumAns[i].indexOf(i)){
//                System.out.println("Сложение");
//                System.out.println("Ответ");
//                System.out.println(romanNumAns[i]);
//            } break;
//        }
//
//        for (int i = 0; i < romanNumAns.length; i++) {
//            if(ans1 - 1 == romanNumAns[i].indexOf(i)){
//                System.out.println("Умножение");
//                System.out.println("Ответ");
//                System.out.println(romanNumAns[i]);
//            }break;
//        }
//
//        for (int i = 0; i < romanNumAns.length; i++) {
//            if(ans2 - 1 == romanNumAns[i].indexOf(i)){
//                System.out.println("Деление");
//                System.out.println("Ответ");
//                System.out.println(romanNumAns[i]);
//            }break;
//        }
//
//        for (int i = 0; i < romanNumAns.length; i++) {
//            if(u - 1 == romanNumAns[i].indexOf(i)){
//                System.out.println("Вычетание");
//                System.out.println("Ответ");
//                System.out.println(romanNumAns[i]);
//            }break;
//        }

        System.out.println("В арабских");
        System.out.println("Сложение");
        System.out.println(main.answerInt(i1, i2));
        System.out.println("Умножение");
        System.out.println(main.answerInt2(i1, i2));
        System.out.println("Деление");
        System.out.println(main.answerInt3(i1, i2));
        System.out.println("Вычетание");
        System.out.println(main.answerInt4(i1, i2));


    }
}
