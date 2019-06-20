import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Roman extends Calc  {
   // public static HashMap<String, Integer> romanNum = new HashMap<>();
    //объявили массив с римскими цифоами для ввода от 1 до 10
    public static String[] romanNumStr = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    //объявили массив с римскими цифоами для вывода ответа
    public static String[] romanNumAns = {"0","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX"};

    @Override
    protected int strToInt(String s) {
        for (int i = 0; i < romanNumStr.length; i++) {
            if (s.equals(romanNumStr[i])) {
                return i + 1;
            }
        }

        throw new RuntimeException("Число не входит в диапозон римских цифр");
    }

    @Override
    protected String intToStr(int s) {
        try {
            return romanNumAns[s];
        }
        catch (Exception e) {
            throw new RuntimeException("Число не входит в диапозон римских цифр");
        }
    }
}
