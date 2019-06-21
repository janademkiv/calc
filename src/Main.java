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

                System.out.println(arabic.calculate(s));
            } catch (Exception e) {

                System.out.println(roman.calculate(s));
            }
        }

    }
}
