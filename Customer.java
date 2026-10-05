package bank.customers;
public class Customer{
    String customerId;
    String customerName;
    String contact;
    public Customer(String customerId, String customerName, String contact){
        this.customerId=customerId;
        this.customerName=customerName;
        this.contact=contact;
    }
    public void displayCustomer(){
        System.out.println("Customer ID : "+customerId);
        System.out.println("Customer Name : "+customerName);
        System.out.println("Contact Number : "+contact);
    }
}
