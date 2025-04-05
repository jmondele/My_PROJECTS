public class Book extends Product {
    private String author;

    // No-arg constructor
    public Book() {
        super();  // Calls Product's no-arg constructor
        System.out.println("Inside book default constructor.");
        author = "Jose Mon";
    }

    // Parameterized constructor
    public Book(String code, String description, double price, String author) {
        super(code, description, price);  // Calls Product's parameterized constructor
        System.out.println("Inside book constructor with parameters.");
        this.author = author;
    }

    // Setter
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter
    public String getAuthor() {
        return author;
    }

    // Overridden print method
    @Override
    public void print() {
        System.out.println("Code: " + getCode() + ", Description: " + getDescription() + 
                           ", Price: " + getPrice() + ", Author: " + author);
    }
}
