package billing;

import java.util.Scanner;

import productDetails.Products;
import registration.Registration;

public class Billing {
    private Registration user;
    private Products prod;
    private String payMethod;

    public Billing(Registration user, Products prod) {
    	this.user = user;
        this.prod = prod;
    }

    public void selectPayMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a payment method:");
        System.out.println("1. Cash on Delivery");
        System.out.println("2. Paytm");
        System.out.println("3. GPay");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        switch (choice) {
            case 1:
                payMethod = "Cash on Delivery";
                break;
            case 2:
                payMethod = "Paytm";
                break;
            case 3:
                payMethod = "GPay";
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Cash on Delivery.");
                payMethod = "Cash on Delivery";
                break;
        }
    }
    public void generateBill() {
        System.out.println("\n---- Bill ----");
        System.out.println("Customer Name: " +user.getCustName());
        System.out.println("Product: " + prod.getProdName());
        System.out.println("Total Price: " + prod.getRate());
        System.out.println("Payment Method: " + payMethod);
        
    }
}