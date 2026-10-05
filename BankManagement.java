import bank.customers.Customer;
import bank.loans.Loan;
import bank.accounts.Account;
import java.util.*;
public class BankManagement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Customer ID");
        String id=sc.nextLine();
        System.out.println("Enter Customer name");
        String n=sc.nextLine();
        System.out.println("Enter contact number");
        String co=sc.nextLine();
        Customer c=new Customer(id,n,co);
        c.displayCustomer();
 
        System.out.println("Enter Loan Number");
        String ln=sc.nextLine();
        System.out.println("Enter Loan Type");
        String lt=sc.nextLine();
        System.out.println("Enter Amount");
        int am=sc.nextInt();
        Loan l=new Loan(ln,lt,am);
        l.displayLoan();
        sc.nextLine();
        System.out.println("Enter Account Number");
        String an=sc.nextLine();
        System.out.println("Enter Account Type");
        String at=sc.nextLine();
        System.out.println("Enter Balance");
        double bal=Double.parseDouble(sc.nextLine());
        Account a1 = new Account(an,at,bal);
        System.out.println("Enter amount to be deposited");
        double amt=sc.nextDouble();
        a1.deposit(amt);
        a1.displayBalance();
 
        System.out.println("Enter amount to be withdrawn");
        double wth=sc.nextDouble();
        a1.withdraw(wth);
        a1.displayBalance();
    }
}