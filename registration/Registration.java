package registration;

import java.util.Scanner;

public class Registration {
    private String CustName;
    private Scanner scanner;

    public Registration() {
        scanner = new Scanner(System.in);
    }

    public boolean register() {
        System.out.println("Enter Username: ");
        this.CustName = scanner.nextLine(); // Save name
        if (!getName()) return false;

        System.out.println("Enter User Contact number: ");
        if (!getMobileNo()) return false;

        System.out.println("Enter User address: ");
        if (!getAddr()) return false;

        System.out.println("Enter User email (optional): ");
        if (!getEmail()) return false;

        System.out.println("\n You have been successfully registered. \n");
        System.out.println("\t\t\t ------ Welcome to the AtoZ Online Shopping application!! ---- \n");
        return true;
    }

    public String getCustName() { 
        return CustName;
    }

    private boolean getName() {
        if (CustName.length() > 20) {
            System.out.println("Name cannot exceed 20 alphabets. \n");
            return false;
        }
        return true;
    }

    private boolean getMobileNo() {
        String mobileNo = scanner.nextLine();
        if (mobileNo.length() != 10) {
            System.out.println("Mobile number must be 10 digits.\n");
            return false;
        }
        return true;
    }

    private boolean getAddr() {
        String addr = scanner.nextLine();
        System.out.print("PIN: ");
        String storedPin = "123456";
        String pincode = scanner.nextLine();

        if (pincode.equals(storedPin)) {
            System.out.println("Pincode verification: Successfull.\n");
            return true;
        } else {
            System.out.println("Pincode verification: failed. Please try again.\n");
            return false;
        }
    }

    private boolean getEmail() {
        String email = scanner.nextLine();
        if (email != null && !email.isEmpty()) {
            if (!email.contains("@") || !email.contains(".")) {
                System.out.println("Email Format is Invalid. \n");
                return false;
            }
        }
        return true;
    }
}