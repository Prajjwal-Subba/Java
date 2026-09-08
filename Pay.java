import java.util.*;
class Payment 
{
    void makePayment(double amount) 
    {
        if(amount<=0)
            System.out.println("Invalid Amount");
        else
            System.out.println("Amount = "+amount);
    }

    void makePayment(double amount,String transactionId) 
    {
        if(amount<=0)
            System.out.println("Invalid Amount");
        else
            System.out.println("Amount = "+amount);
        if(transactionId.isEmpty())
            System.out.println("Invalid Transaction Id");
        else
            System.out.println("Transaction ID = "+transactionId);
    }
}
class CreditCardPayment extends Payment 
{
    void makePayment(double amount) 
    {
        System.out.println("Credit Card Payment");
        super.makePayment(amount);
    }
}
class UPIPayment extends Payment
{
    void makePayment(double amount) 
    {
        System.out.println("UPI Payment");
        super.makePayment(amount);
    }
}
class NetBankingPayment extends Payment 
{
    void makePayment(double amount) 
    {
        System.out.println("Net Banking Payment");
        super.makePayment(amount);
    }
}
class Pay 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter credit card amount");
        double ca=sc.nextDouble();
        Payment p1 = new CreditCardPayment();
        p1.makePayment(ca);
        System.out.println("Enter UPI amount");
        double upi=sc.nextDouble();
        Payment p2 = new UPIPayment();
        p2.makePayment(upi);
        System.out.println("Enter Net Banking amount");
        double net=sc.nextDouble();
        Payment p3 = new NetBankingPayment();
        p3.makePayment(net);
        System.out.println("Enter payment amount with transaction id");
        double pa=sc.nextDouble();
        String ti=sc.nextLine();
        sc.nextLine();
        p1.makePayment(pa,ti);
    }
}