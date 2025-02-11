import java.util.regex.Pattern;

abstract class Calc {

    //
    public String calculate(String expression) {

        //получаем символ арифметической операции
        String operation = getOperation(expression);

        //убрать все пробелы из введеной строки
        //разделение строки по арифметич. знаку
        String [] parts = expression.replace(" ","").split(Pattern.quote(operation));


        int a = strToInt(parts[0]); //присваеваем строке элемент массива 0
        int b = strToInt(parts[1]); //присваеваем строке элемент массива 1

        //проверяем введеные числа на диапозон от 1 до 10
        if (a >= 1 && a <= 10 && b >= 1 && b <= 10) {
            // исходя из полученного символа, вызывается нажная нам арифм. операц.  и получаем ответ
            switch (operation) {
                case "+":
                    return intToStr(plus(a, b));
                case "-":
                    return intToStr(minus(a, b));
                case "*":
                    return intToStr(multiply(a, b));
                case "/":
                    return intToStr(division(a, b));
                default:
                    throw new RuntimeException("Несоответсвующая арифметическая операция.");
            }
        } else {
            throw new IllegalArgumentException("Введен неверный диапозон чисел.");
        }

    }

    //проверяем, содержит ли введеная строка символ арифметической операции
    protected String getOperation(String expression){
        if (expression.contains("+")) {
            return "+";
        } else if (expression.contains("-")){
            return "-";
        } else if (expression.contains("*")) {
            return "*";
        } else if (expression.contains("/")) {
            return "/";
        } else {
            throw new RuntimeException("Несоответсвующая арифметическая операция.");
        }

    }

    protected int plus(int a, int b){

        return a + b;
    }

    protected int multiply(int a, int b){

        return a * b;
    }

    protected int division(int a, int b){

        return a / b;
    }

    protected int minus(int a, int b){

        return a - b;
    }


    //абстрактный метод для конвертации данных(полученое число после арифм. операц.).
    protected abstract int strToInt(String s);
    protected abstract String intToStr(int s);
}
