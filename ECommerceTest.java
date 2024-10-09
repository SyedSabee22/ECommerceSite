package codingAssessment;

import java.util.Date;
 import java.util.*;

public class ECommerceTest {

	public static void main(String[] args) {
		    Scanner scn= new Scanner(System.in);
		        Product product1 = new Product(1, "Laptop", 70000.0, 20);
		        Product product2 = new Product(2, "Smartphone", 50000.0, 50);
		        Product product3 = new Product(3, "Refrigerator", 15000.0, 40);
		        Product product4 = new Product(4, "Ovan", 3000.0, 70);
		        Product product5 = new Product(5, "Washing Machine", 12000.0, 10);

		        // Create user
		         System.out.println("Enter your user Id");
		        int id= scn.nextInt();scn.nextLine();
		        System.out.println("Enter Your Name");
		         String name=scn.nextLine();
		         System.out.println("Enter Your Authorized Email_Id");
		          String email=scn.nextLine();
		        User user = new User(id,name, email);

		        // Create order for the user
		        Order order = new Order(1, user);
		        System.out.println("Enter the option for required product");
		        System.out.println("1-Laptop");
		        System.out.println("2-Smartphone");
		        System.out.println("3-Refrigerator");
		        System.out.println("4-Ovan");
		        System.out.println("5-Washing Machine");
		         try {
					int p=scn.nextInt();scn.nextLine();
					 if(p>5) {
			        	   System.out.println("Invalid Input");
			          }
					 else {
					 
					 System.out.println("Enter Quantity");
					  int q=scn.nextInt();
					  if(p==1) {
						  order.addProduct(product1, q);
					  }
					  if(p==2) {
						  order.addProduct(product2, q);
					  }
					  if(p==3) {
						  order.addProduct(product3, q);
					  }
					  if(p==4) {
						  order.addProduct(product4, q);
					  }
					  if(p==5) {
						  order.addProduct(product5, q);
					  }
					  
					 }
					// User creates order
					user.createOrder(order);

					// Create payment for the order
					Payment payment = new Payment(1, order, 3550000.0, new Date()); // Full payment for order
					payment.processPayment();

					// Output order and payment details
					System.out.println("Order Status: " + order.getStatus());
					System.out.println("Total Order Amount: $" + order.getTotal());
					System.out.println("Payment Processed: $" + payment.getAmount());
					System.out.println("Remaining stock of Laptop: " + product1.getStock());
					System.out.println("Remaining stock of Smartphone: " + product2.getStock());
					System.out.println("Remaining stock of Smartphone: " + product3.getStock());
					System.out.println("Remaining stock of Smartphone: " + product4.getStock());
					System.out.println("Remaining stock of Smartphone: " + product5.getStock());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
}
