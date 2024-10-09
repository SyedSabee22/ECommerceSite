package codingAssessment;

import java.util.Date;

public class Payment {
    private int paymentId;
    private Order order;
    private double amount;
    private Date paymentDate;

    // Constructor
    public Payment(int paymentId, Order order, double amount, Date paymentDate) {
        this.paymentId = paymentId;
        this.order = order;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    // Method to process payment and update order status
    public void processPayment() {
        if (this.amount >= order.getTotal()) {
            order.setStatus("Completed");
        } else {
            throw new IllegalArgumentException("Insufficient payment for order " + order.getOrderId());
        }
    }

    // Getter methods
    public int getPaymentId() {
        return paymentId;
    }

    public Order getOrder() {
        return order;
    }

    public double getAmount() {
        return amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }
}

