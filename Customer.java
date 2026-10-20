
public class Customer {

    private String customerID;
    private String name;
    private String phone;

    public Customer(String customerID, String name, String phone) {
        setCustomerID(customerID);
        setName(name);
        setPhone(phone);
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        if (customerID.length() != 3||customerID==null) {
            throw new IllegalArgumentException(" Customer ID must contain 3 digits ");
        }
        for (int i = 0; i < customerID.length(); i++) {
            if (customerID.charAt(i) < '0' || customerID.charAt(i) > '9') {
                throw new IllegalArgumentException("Customer ID must contain numbers only");
            }
        }
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null||name.isEmpty()) {
            throw new IllegalArgumentException(" Invalid name ");
        }
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone.length()!= 10||phone==null) {
            throw new IllegalArgumentException(" Phone must contain 10 digits ");
        }
        for (int i = 0; i < phone.length(); i++) {
            if (phone.charAt(i) < '0' || phone.charAt(i) > '9') {
                throw new IllegalArgumentException(
                        "Phone must contain numbers only"
                );
            }
        }
        this.phone = phone;
    }

    public void display() {
        System.out.println(" Customer ID : " + getCustomerID());
        System.out.println(" Name : " + getName());
        System.out.println(" Phone Number : " + getPhone());
    }
}
