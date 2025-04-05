import java.util.Scanner;

public class Multi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        boolean validInput1 = false, validInput2 = false;

        System.out.println("Program determines if first number is multiple of second, prints result.");
        System.out.println("Jose Mon");
        while (!validInput1) {
            System.out.print("Enter Num1: ");
            if (scanner.hasNextInt()) {
                num1 = scanner.nextInt();
                validInput1 = true;
            } else {
                System.out.println("Not valid integer!");
                scanner.next(); // Clear the invalid input
            }
        }

        while (!validInput2) {
            System.out.print("Enter Num2: ");
            if (scanner.hasNextInt()) {
                num2 = scanner.nextInt();
                validInput2 = true;
            } else {
                System.out.println("Not valid integer!");
                scanner.next(); // Clear the invalid input
            }
        }

        if (num2 != 0 && num1 % num2 == 0) {
            System.out.printf("%d is a multiple of %d%n", num1, num2);
            System.out.printf("The product of %d and %d is %d%n", num1 / num2, num2, num1);
        } else {
            System.out.printf("%d is not a multiple of %d%n", num1, num2);
        }

        scanner.close();
    }
}