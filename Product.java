package codingAssessment;

public class Product {
    private int productId;
    private String name;
    private double price;
    private int stock;

    // Constructor
    public Product(int productId, String name, double price, int stock) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Method to reduce the stock
    public void reduceStock(int quantity) {
        if (this.stock >= quantity) {
            this.stock -= quantity;
        } else {
            throw new IllegalArgumentException("Not enough stock for " + this.name);
        }
    }

    // Method to add stock
    public void addStock(int quantity) {
        this.stock += quantity;
    }

    // Getter methods
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
}

