package Calculator_1;

public class Calculator {

    public double num1;
    public double num2;
    public double sum;

    public double add(double num1, double num2){
        return num1 + num2;
    }

    public double substract(double num1, double num2){
        return num1 - num2;
    }

    public double multiply(double num1, double num2){
        return num1 * num2;
    }

    public double divide(double num1, double num2){
        return num1 / num2;
    }

    public double operation(String sign){
        if (sign.equals("+"))
           return add(num1, num2);
        else if (sign.equals("-"))
            return substract(num1, num2);
        else if (sign.equals("*"))
            return multiply(num1, num2);
        else if (sign.equals("/"))
            return divide(num1, num2);
        else
            return -1;
    }

}
