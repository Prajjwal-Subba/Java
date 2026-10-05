package bank.loans;
public class Loan {
    String loanNo;
    String loanType;
    int amount;
    public Loan(String loanNo, String loanType, int amount){
        this.loanNo=loanNo;
        this.loanType=loanType;
        this.amount=amount;}
    public void displayLoan(){
        System.out.println("Loan Number : "+loanNo);
        System.out.println("Loan Type : "+loanType);
        System.out.println("Loan Amount : "+amount);
    }
}
