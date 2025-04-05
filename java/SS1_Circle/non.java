import java.util.Scanner;

public class non {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = 0;
        boolean validInput = false;
        System.out.println("Non-OOP program diameter, circunference, and circle area");
        System.out.println("Jose Mon");
        while (!validInput) {
      
            System.out.print("Enter circle radius: ");
      
            if (scanner.hasNextDouble()) {
                radius = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Not valid number!");
                scanner.next(); // Clear the invalid input
            }
        }
        System.out.print("Jose Mon");

        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.printf("Jose Mon");
        System.out.printf("Circle diameter: %.2f%n", diameter);
        System.out.printf("Circumference: %.2f%n", circumference);
        System.out.printf("Area: %.2f%n", area);

        scanner.close();
    }
}