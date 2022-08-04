package Calculator_1;

import java.util.Scanner;

public class CalculatorTest {


    public static void main(String[] args) {
        Calculator calc = new Calculator();

        Scanner input = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;

        while (true) {

            System.out.print("Enter first number: ");
            if (input.hasNextDouble()){
                calc.num1 = input.nextDouble();
            } else {
                System.out.println("Wrong input.");
                break;
            }

            System.out.print("Enter second number: ");
            if (input.hasNextDouble()){
                calc.num2 = input.nextDouble();
            } else {
                System.out.println("Wrong input.");
                break;
            }

            System.out.print("\n 1. +\n 2. -\n 3. *\n 4. /\n 5. Exit\n\nEnter your operation: ");
            String op = input.next();
            if (op != "+" || op != "-" || op != "*" || op != "/"){
                break;
            } else {
                System.out.println(calc.operation(op));
            }

        }
    }
}
