package nguyen.customer;

import java.util.Scanner;

public class CustomerApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Customer Viewer\n");

        Scanner sc = new Scanner(System.in);
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {

            System.out.print("Enter a customer number: ");
            String custCode = sc.nextLine();
            System.out.println();
            Customer customer = CustomerDB.getCustomer(custCode);

            if (customer.getName().equalsIgnoreCase("")) {
                System.out.println("There is no customer number " + custCode + " in our records.\n");
            } else {
                System.out.println(customer.getNameAndAddress());
                System.out.println();
            }

            System.out.print("Display another customer? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
    }
}

