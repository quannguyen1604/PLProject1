package nguyen.customer;

/**
 * Created by Ryan_Wechter on 2/1/16.
 */
public class Customer {

    static String custName;
    static String custAddress;
    static String custCity;
    static String custState;
    static String custPostalCode;

    public static void set(String name, String address,
                            String city, String state, String postalCode) {
        custName = name;
        custAddress = address;
        custCity = city;
        custState = state;
        custPostalCode = postalCode;
    }


    public static void get() {
        System.out.println(custName);
    }
}
