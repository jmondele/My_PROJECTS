import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double total = 0;
        boolean validInput;
        System.out.println("Jose Mon");
        System.out.println("Program counts, totals, and averages total number of user-entered exam scores.");
        System.out.println("Please enter exam scores between 0 and 100, inclusive.");
        System.out.println("Enter out of range number to end program.");

        while (true) {
            validInput = false;
            double score = 0;

            while (!validInput) {
                System.out.print("Enter exam score: ");
                if (scanner.hasNextDouble()) {
                    score = scanner.nextDouble();
                    validInput = true;
                } else {
                    System.out.println("Not valid number!");
                    scanner.next(); // Clear the invalid input
                }
            }

            if (score < 0 || score > 100) {
                break;
            }

            count++;
            total += score;
        }

        if (count > 0) {
            double average = total / count;
            System.out.printf("Count: %d%n", count);
            System.out.printf("Total: %.1f%n", total);
            System.out.printf("Average: %.1f%n", average);
        } else {
            System.out.println("No valid scores entered.");
        }

        scanner.close();
    }
}