package porcarkumner;

import java.util.Scanner;

public class calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            try {
                System.out.println("Please input the first number:");
                int n1 = Integer.parseInt(scanner.nextLine());

                System.out.println("Please input +, -, *, or /:");
                String operator = scanner.nextLine();

                if (operator.equals("exit")) {
                    isRun = false;
                    continue;
                }

                System.out.println("Please input the second number:");
                int n2 = Integer.parseInt(scanner.nextLine());

                switch (operator) {
                    case "+":
                        System.out.println(n1 + n2);
                        break;
                    case "-":
                        System.out.println(n1 - n2);
                        break;
                    case "*":
                        System.out.println(n1 * n2);
                        break;
                    case "/":
                        if (n2 == 0) {
                            System.out.println("Error: Division by zero!");
                        } else {
                            System.out.println(n1 / n2);
                        }
                        break;
                    default:
                        System.out.println("Invalid operator. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        System.out.println("Calculator is closed.");
        scanner.close();
    }
}