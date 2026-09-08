import java.util.*;
class bankAccount
{
    String accountHolderName;
    long accountNo;
    String accountType;
    double accountBalance;
    bankAccount(String n,long an,String at,double ab)
    {
        accountHolderName=n;
        accountNo=an;
        accountType=at;
        accountBalance=ab;
    }
    void display()
    {
        System.out.println("Account Holder : "+accountHolderName);
        System.out.println("Account Number : "+accountNo);
        System.out.println("Account Type : "+accountType);
        System.out.println("Account Balance : "+accountBalance);
    }
    void deposit(double amt)
    {
        accountBalance+=amt;
        System.out.println("Amount deposited : "+amt);
    }
    void withdraw(double amt)
    {
        if(amt<=0)
        {
            System.out.println("Please enter a valid amount to withdraw");
        }
        else if(amt<=accountBalance)
        {
            accountBalance-=amt;
            System.out.println("Amount withdrawn : "+amt);
        }
        else
        {
            System.out.println("The Account has Insufficient Balance");
        }
    } 
    void balanceEnquiry()
    {
        System.out.println("Account Balance : "+accountBalance);
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Enter your account number");
        long no=sc.nextLong();
        System.out.println("Enter your account type");
        String ty=sc.next();
        System.out.println("Account Balance");
        double bal=sc.nextDouble();
        bankAccount obj= new bankAccount(name, no, ty, bal);     
        obj.display();
        System.out.println("Enter the amount to deposit");
        double am=sc.nextDouble();
        obj.deposit(am);
        System.out.println("Enter the amount to withdraw");
        double amt1=sc.nextDouble();
        obj.withdraw(amt1);
        obj.balanceEnquiry();    
    }
}
