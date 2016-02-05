package nguyen.customer;

public class Customer {

    //instance variables
    private String custCode;
    private String custName;
    private String custAddress;
    private String custCity;
    private String custState;
    private String custPostalCode;

    //default constructor
    public Customer() {
        custCode = "";
        custName = "";
        custAddress = "";
        custCity = "";
        custState = "";
        custPostalCode = "";
    }

    //constructor
    public Customer(String code, String name, String address, String city, String state, String postalCode) {
        custCode = code;
        custName = name;
        custAddress = address;
        custCity = city;
        custState = state;
        custPostalCode = postalCode;
    }

    //set and get methods for each variable
    public void setCode(String code) {
        custCode = code;
    }

    public String getCode() {
        return custCode;
    }

    public void setName(String name) {
        custName = name;
    }

    public String getName() {
        return custName;
    }

    public void setAddress(String address) {
        custAddress = address;
    }

    public String getAddress() {
        return custAddress;
    }

    public void setCity(String city) {
        custCity = city;
    }

    public String getCity() {
        return custCity;
    }

    public void setState(String state) {
        custState = state;
    }

    public String getState() {
        return custState;
    }

    public void setPostalCode(String postalCode) {
        custPostalCode = postalCode;
    }

    public String getPostalCode() {
        return custPostalCode;
    }

    //custom get method for display
    public String getNameAndAddress() {
        String nameAndAddressFormatted = custName + "\n" + custAddress + "\n"
                + custCity + ", " + custState + " " + custPostalCode;
        return nameAndAddressFormatted;
    }
}
