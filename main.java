import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1, num2, result;
        String operation;

        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();

        System.out.print("Enter operation (+, -, *, /): ");
        operation = sc.next();

        switch (operation) {
            case "+":
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case "/":
                result = num1 / num2;
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }

    }

}