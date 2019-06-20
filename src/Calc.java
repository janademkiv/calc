import java.util.regex.Pattern;

abstract class Calc {

    public int calculate(String expression) {

        String operation = getOperation(expression);

        //убрать все пробелы из введеной строки
        //разделение строки по арифметич. знаку, добавить иф для разных арифметических знаков
        String [] parts = expression.replace(" ","").split(Pattern.quote(operation));

        int a = strToInt(parts[0]); //присваеваем строке элемент массива 0
        int b = strToInt(parts[1]); //присваеваем строке элемент массива 1

        switch (operation) {
            case "+":
                return plus(a, b);
            case "-":
                return minus(a, b);
            case "*":
                return multiply(a, b);
            case "/":
                return division(a, b);
            default:
                throw new RuntimeException("Несоответсвующая арифметическая операция.");
        }
    }

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

    protected abstract int strToInt(String s);
    protected abstract String intToStr(int s);
}
