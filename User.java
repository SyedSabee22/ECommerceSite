package codingAssessment;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int userId;
    private String name;
    private String email;
    private List<Order> orders;

    // Constructor
    public User(int userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.orders = new ArrayList<>();
    }

    // Method to create a new order
    public void createOrder(Order order) {
        this.orders.add(order);
    }

    // Getter methods
    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Order> getOrders() {
        return orders;
    }
}
