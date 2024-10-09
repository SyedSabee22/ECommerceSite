package codingAssessment;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private User user;
    private List<OrderItem> items;
    private String status;
    private double total;

    // Constructor
    public Order(int orderId, User user) {
        this.orderId = orderId;
        this.user = user;
        this.items = new ArrayList<>();
        this.status = "Pending";
        this.total = 0.0;
    }

    // Method to add products to the order
    public void addProduct(Product product, int quantity) {
        this.items.add(new OrderItem(product, quantity));
        this.total += product.getPrice() * quantity;
        product.reduceStock(quantity); // Reduce stock when product is added to order
    }

    // Getter methods
    public int getOrderId() {
        return orderId;
    }

    public User getUser() {
        return user;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public String getStatus() {
        return status;
    }

    public double getTotal() {
        return total;
    }

    // Method to update order status
    public void setStatus(String status) {
        this.status = status;
    }
}
