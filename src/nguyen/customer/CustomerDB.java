package nguyen.customer;

import nguyen.customer.Customer;
/**
 * Created by Ryan_Wechter on 1/31/16.
 */
public class CustomerDB {

    public static void main() {
        Customer customerOne = new Customer();
        customerOne.set("john","1234 john st","austin","texas","78751");
        customerOne.get();
    }

    public static void print(String x) {
        System.out.println(x + " called the customer databased");
    }
}
