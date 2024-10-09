package codingAssessment;

public class OrderItem {
    private Product product;
    private int quantity;

    // Constructor
    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    // Getter methods
    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
