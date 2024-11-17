package main;

import java.util.Scanner;

import billing.Billing;
import registration.Registration;
import productDetails.ProductDetails;
import productDetails.Products;

public class AtoZOnApp {
    public static void main(String[] args) {
        Registration registration = new Registration();
        ProductDetails productDetails = new ProductDetails();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("LabUserId: 1719473797 \n") ;
        System.out.println("StudentId: 202217b3021 \n") ;

        if (registration.register()) {
            Products selectedProd = productDetails.getStoreProducts();
                Billing billing = new Billing(registration, selectedProd);
                billing.selectPayMethod();
                billing.generateBill();
                
                System.out.println("\nThanks for Shopping with us!");
                System.out.println("\n------- Have a great day ahead! --------");
            } else {
                System.out.println("Please try again after some time...");
            }
        } 
    }