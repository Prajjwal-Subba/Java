package bank.accounts;
public class Account{
    String accountNumber;
    String accountType;
    double balance;
    public Account(String accountNumber, String accountType, double balance) {
        this.accountNumber=accountNumber;
        this.accountType=accountType;
        this.balance=balance;
    }
    public void deposit(double amount){
        if(amount<=0) 
            System.out.println("Invalid deposit amount");
        else{
            balance+=amount;
            System.out.println("Amount Deposited: "+amount);
        }
    }
    public void withdraw(double amount){
        if(amount<=0)
            System.out.println("Invalid withdrawal amount");
        else if(amount>balance) 
            System.out.println("Insufficient balance");
        else{
            balance-=amount;
            System.out.println("Amount withdrawn: "+amount);
        }
    }
    public void displayBalance(){
        System.out.println("Account No: "+accountNumber);
        System.out.println("Account Type: "+accountType);
        System.out.println("Balance: "+balance);
    }
}
