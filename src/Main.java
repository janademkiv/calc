import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //ввод данных

        Arabic arabic = new Arabic();
        Roman roman = new Roman();

        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();

            try {
                int calculate = arabic.calculate(s);
                System.out.println(arabic.intToStr(calculate));
            } catch (Exception e) {
                int calculate = roman.calculate(s);
                System.out.println(roman.intToStr(calculate));
            }
        }

    }
}
