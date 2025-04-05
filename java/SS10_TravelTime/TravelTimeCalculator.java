import java.util.Scanner;

public class TravelTimeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        System.out.println("=============================================");
        System.out.println("      Travel Time Calculator Program");
        System.out.println("           Created by Jose Mon");
        System.out.println("=============================================");
        System.out.println("Instructions:");
        System.out.println("- Enter the number of miles (between 1 and 3000)");
        System.out.println("- Enter the speed in mph (between 1 and 100)");
        System.out.println("- Program will calculate and display the estimated travel time.");
        System.out.println("- You may continue calculating by typing 'y' when prompted.");
        System.out.println("---------------------------------------------");

        while (continueProgram) {
            double miles = 0;
            double mph = 0;

            // Validate miles input
            while (true) {
                System.out.print("Enter miles: ");
                if (scanner.hasNextDouble()) {
                    miles = scanner.nextDouble();
                    if (miles > 0 && miles <= 3000) {
                        break;
                    } else {
                        System.out.println("Miles must be between 1 and 3000, inclusive. Please try again.");
                    }
                } else {
                    System.out.println("Please enter valid number.");
                    scanner.next(); // Clear invalid input
                }
            }

            // Validate mph input
            while (true) {
                System.out.print("Enter mph: ");
                if (scanner.hasNextDouble()) {
                    mph = scanner.nextDouble();
                    if (mph > 0 && mph <= 100) {
                        break;
                    } else {
                        System.out.println("MPH must be between 1 and 100, inclusive. Please try again.");
                    }
                } else {
                    System.out.println("Please enter valid number.");
                    scanner.next(); // Clear invalid input
                }
            }

            // Calculate travel time
            double totalTime = miles / mph;
            int hours = (int) totalTime;
            int minutes = (int) Math.round((totalTime - hours) * 60);

            System.out.println("Estimated travel time: " + hours + " hr(s) " + minutes + " Minutes");
            System.out.println("Thank you for using the program!");

            // Ask user to continue
            System.out.print("Continue? (y/n): ");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("y")) {
                continueProgram = false;
                System.out.println("Goodbye!");
            }
        }

        scanner.close();
    }
}