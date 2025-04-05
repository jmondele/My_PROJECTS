import java.util.Scanner;

public class TimeConversion {
    // Constants for time conversions
    public static final int SECS_IN_MIN = 60;
    public static final int MINS_IN_HR = 60;
    public static final int HRS_IN_DAY = 24;
    public static final int DAYS_IN_WEEK = 7;
    public static final int DAYS_IN_YR = 365;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds;

        System.out.println("Program converts seconds to minutes, hours, days, weeks, and (regular) years--365 days.");
        System.out.println("***Notes***:");
        System.out.println("1) Use integer for seconds (must validate integer input).");
        System.out.println("2) Use printf() function to print (format values per below output).");
        System.out.println("3) Create Java \"constants\" for the following values:");
        System.out.println("   SECS_IN_MIN, MINS_IN_HR, HRS_IN_DAY, DAYS_IN_WEEK, DAYS_IN_YR (365 days)");
        System.out.println("Jose Mon");

        // Input validation loop
        while (true) {
            System.out.print("\nPlease enter number of seconds: ");
            if (scanner.hasNextInt()) {
                seconds = scanner.nextInt();
                if (seconds < 0) {
                    System.out.println("Invalid input! Seconds must be non-negative.");
                } else {
                    break;
                }
            } else {
                System.out.println("Not valid integer!");
                scanner.next(); // Consume invalid input
            }
        }

        // Perform conversions
        double minutes = seconds / (double) SECS_IN_MIN;
        double hours = minutes / MINS_IN_HR;
        double days = hours / HRS_IN_DAY;
        double weeks = days / DAYS_IN_WEEK;
        double years = days / (double) DAYS_IN_YR;

        // Display results
        System.out.printf("\n%d second(s) equals\n", seconds);
        System.out.printf("%.2f minute(s)\n", minutes);
        System.out.printf("%.3f hour(s)\n", hours);
        System.out.printf("%.4f day(s)\n", days);
        System.out.printf("%.5f week(s)\n", weeks);
        System.out.printf("%.6f year(s)\n", years);

        scanner.close();
    }
}