package nguyen.customer;

public class CustomerDB {

    //static method
    public static Customer getCustomer(String custCode) {
        Customer customer = new Customer();
        customer.setCode(custCode);
        if (custCode.equalsIgnoreCase("1001")) {
            customer.setName("Barbara White");
            customer.setAddress("3400 Richmond Parkway #3423");
            customer.setCity("Bristol");
            customer.setState("CT");
            customer.setPostalCode("06010");
        } else if (custCode.equalsIgnoreCase("1002")) {
            customer.setName("Karl Vang");
            customer.setAddress("327 Franklin Street");
            customer.setCity("Edina");
            customer.setState("MN");
            customer.setPostalCode("55435");
        } else if (custCode.equalsIgnoreCase("1003")) {
            customer.setName("Ronda Chavan");
            customer.setAddress("518 Commanche Dr.");
            customer.setCity("Greensboro");
            customer.setState("NC");
            customer.setPostalCode("27410");
        }
        return customer;
    }
}