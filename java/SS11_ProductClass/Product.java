public class Product {
    // Private data members
    private String code;
    private String description;
    private double price;

    // No-arg constructor
    public Product() {
        System.out.println("Inside product default constructor.");
        code = "abc123";
        description = "My Widget";
        price = 49.99;
    }

    // Parameterized constructor
    public Product(String code, String description, double price) {
        System.out.println("Inside product constructor with parameters.");
        this.code = code;
        this.description = description;
        this.price = price;
    }

    // Setter methods
    public void setCode(String code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getter methods
    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return String.format("$%.2f", price);
    }

    // Print method
    public void print() {
        System.out.println("Code: " + code + ", Description: " + description + ", Price: " + getPrice());
    }
}
