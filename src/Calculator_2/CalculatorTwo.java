package Calculator_2;

import java.util.Scanner;

public class CalculatorTwo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double sum = 0;
        double num1 = 0;
        double num2 = 0;

        while (true){
            System.out.print("Enter your first number: ");
            if (input.hasNextDouble()){
                num1 = input.nextDouble();
            } else {
                System.out.println("Wrong input.");
                break;
            }

            System.out.print("Enter your second number: ");
            if (input.hasNextDouble()){
                num2 = input.nextDouble();
            } else {
                System.out.println("Wrong input.");
                break;
            }

            System.out.print("\n 1. Add\n 2. Subtract\n 3. Multiply\n 4. Divide\n 5. Exit\n\nEnter your operation: ");
            String operation = input.next().toLowerCase();

            if (operation.equals("add") || operation.equals("+")) {
                sum = num1 + num2;
                System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, sum);
            } else if (operation.equals("subtract") || operation.equals("-")) {
                sum = num1 - num2;
                System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, sum);
            } else if (operation.equals("multiply") || operation.equals("*")) {
                sum = num1 * num2;
                System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, sum);
            } else if (operation.equals("divide") || operation.equals("/")) {
                sum = num1 / num2;
                System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, sum);
            } else {
                break;
            }
            System.out.println("");

        }
    }

}
