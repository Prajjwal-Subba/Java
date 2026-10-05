import java.util.*;
class InsufficientBalanceException extends Exception
{
    public InsufficientBalanceException(String message)
    {
        super(message);
    }
}
class Account
{
    String accountHolder;
    double balance;
    Account(String accountHolder, double balance)
    {
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    void display()
    {
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Available Balance: "+balance);
    }
    void withdraw(double amount) throws InsufficientBalanceException
    {
        if (amount<0) 
            throw new InsufficientBalanceException("Withdrawal amount cannot be negative.");
        if (amount==0)
            throw new InsufficientBalanceException("Withdrawal amount cannot be zero.");
        if (amount>balance)
            throw new InsufficientBalanceException("Insufficient balance!");
        balance -= amount;
        System.out.println("Amount withdrawn : "+amount);
    }
}
class ATM
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter account holder name");
        String ah=sc.nextLine();
        System.out.println("Enter balance");
        double bal=sc.nextDouble();
        Account acc=new Account(ah,bal);
        acc.display();
        System.out.print("Enter withdrawal amount: ");
        double am=sc.nextDouble();
        try 
        {
            acc.withdraw(am);
            System.out.println("Remaining balance: "+acc.balance);
        } 
        catch(InsufficientBalanceException e) 
        {
            System.out.println("Error: "+e.getMessage());
            System.out.println("Available balance: "+acc.balance);
        }
    }
}
