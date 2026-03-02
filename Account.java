public class Account {
    private int balance;
    int amount;
    int withdraw_amt;
    Account(int amount, int withdraw_amt){
        
        this.amount = amount;
        this.withdraw_amt = withdraw_amt;
    }
    
    public void Deposit(){
        if(amount>0){
            System.out.println("You deposited "+amount+" rupees in your bank account");
            balance = amount;
        }
        else{
            System.out.println("Enter a valid amout to deposit");
        }
    }
    public void Withdraw(){
        if(withdraw_amt<=balance){
            System.out.println(+withdraw_amt+" has been withdrawn from your account");
            balance = amount - withdraw_amt;
            System.out.println(balance+" rupees have been left in your account");
        }

    }
}

class Main{
    public static void main(String[] args) {
        Account a = new Account(50000, 25000);
        a.Deposit();
        a.Withdraw();
    }
}