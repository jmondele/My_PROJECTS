import java.util.Scanner;

public class ProductDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Default constructor
        System.out.println("/////Below are default constructor values://///");
        Product p1 = new Product();
        System.out.println("Code = " + p1.getCode());
        System.out.println("Description = " + p1.getDescription());
        System.out.println("Price = " + p1.getPrice());
        System.out.println();

        // Parameterized constructor
        System.out.println("/////Below are user-entered values://///");
        System.out.print("Enter code: ");
        String code = sc.next();
        sc.nextLine(); // Consume leftover newline

        System.out.print("Enter description: ");
        String description = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        sc.nextLine(); // Consume newline

        Product p2 = new Product(code, description, price);
        System.out.println("Code: " + p2.getCode());
        System.out.println("Description: " + p2.getDescription());
        System.out.println("Price: " + p2.getPrice());
        System.out.println();

        // Using setters and print method
        System.out.println("/////Below using setter methods to pass literal values, then print() method to display values://///");
        Product p3 = new Product();
        p3.setCode("xyz789");
        p3.setDescription("Test Widget");
        p3.setPrice(89.99);
        p3.print();

        sc.close();
    }
}
