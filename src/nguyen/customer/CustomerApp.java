package nguyen.customer;

import java.util.Scanner;
import nguyen.customer.CustomerDB;

public class CustomerApp {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Welcome to the Customer Viewer\n");
        System.out.println("Please enter a customer number: ");
        Scanner userInput = new Scanner(System.in);
        String custNum = userInput.next();
        System.out.println(custNum);
        System.out.println("Please enter your name");
        String custName = userInput.next();
        System.out.println(custName);
        helloWorld("hello");
        CustomerDB newCust = new CustomerDB();
        newCust.print("ryan");
        newCust.main();

    }

    public static void helloWorld(String x) {
        System.out.println("hello world" + x);
    }

}

