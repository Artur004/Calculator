
public class Calculation {
    private Calculation() {
    }

    private static double firstValue;
    private static double secondValue;

    private static double result;

    private static Operator operator;

    public static String getResult() {
        calc();

        if (result - (int)result == 0){
            return String.valueOf((int) result);
        }
            return String.valueOf(result);
    }

    private static void calc() {
        switch (operator) {
            case PLUS -> result = firstValue + secondValue;
            case MINUS -> result = firstValue - secondValue;
            case DIVISION -> result = firstValue / secondValue;
            case MULTIPLICATION -> result = firstValue * secondValue;
        }
    }

    public static void setOperator(Operator operator) {
        Calculation.operator = operator;
    }

    public static void setFirstValue(String value) {
        Calculation.firstValue = Double.parseDouble(value);
    }

    public static void setSecondValue(String value) {
        Calculation.secondValue = Double.parseDouble(value);
    }

    public static String getFirstValue() {
        return String.valueOf(firstValue);
    }

    public static String getSecondValue() {
        return String.valueOf(secondValue);
    }

    public static Operator getOperator() {
        return operator;
    }

}
