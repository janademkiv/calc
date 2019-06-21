import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Roman extends Calc  {
   // public static HashMap<String, Integer> romanNum = new HashMap<>();
    //объявили массив с римскими цифоами для ввода от 1 до 10
    public static String[] romanNumStr = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    //объявили массив с римскими цифоами для вывода ответа
    public static String[] romanNumAns = {"0","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX"};

    //переопределяем абстрактный метод класса Calc
    @Override
    //конвертируем полученую строку(римскую цифру) в эквивалентное ей число
    protected int strToInt(String s) {
        for (int i = 0; i < romanNumStr.length; i++) {

            if (s.equals(romanNumStr[i])) {
                return i + 1;
            }
        }

        throw new RuntimeException("Число не входит в диапозон римских цифр или введены не верные данные");
    }

    @Override
    protected String intToStr(int s) {
        //если результат операции меньше нуля, то вернуть отрицательную римскую цифру
        if (s < 0) {
            int abs = Math.abs(s);
            String a = "-" + romanNumAns[abs];
            return a;
        //иначе положительная
        } else {
            return romanNumAns[s];
        }

    }
}
