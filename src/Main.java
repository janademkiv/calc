import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //ввод данных

        Arabic arabic = new Arabic();
        Roman roman = new Roman();

        System.out.println("Введите строку вида 2 + 2 или V+V");
        //повторять ввод и показывать решения, пока вводимые данные соответствуют требованиям
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();

            //если произойдет исключение(введены строки вместо цифр), то отработает блок кода catch с вызовом экз. класса Roman для римских цифр.
            try {

                System.out.println(arabic.calculate(s));
            } catch (NumberFormatException e) {

                System.out.println(roman.calculate(s));
            }

        }

    }
}
