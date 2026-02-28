public class BankAccount {
    String name;
    int dep_amount;
    int withdraw_amt;
    
    public BankAccount(String name, int dep_amount, int withdraw_amt){
        this.dep_amount = dep_amount;
        this.withdraw_amt = withdraw_amt;
        this.name = name;
        System.out.println("Hello "+name+", welcome to our bank. Enjoy our banking services");
    }
    
    public void deposit(int dep_amount){
        System.out.println("The amount you deposited is "+dep_amount);
    }
    public void withdraw(int withdraw_amt){
        if(withdraw_amt<=dep_amount){
            System.out.println("The amount you withdrew is "+withdraw_amt);
        }
        else{
            System.out.println("Unavailable amount");
        }
    }
    public void balance_check(){
        int av_bal = dep_amount - withdraw_amt;
        System.out.println("Available balance is "+av_bal);
    }

}
class Main{
    public static void main(String[] args) {
        BankAccount obj = new BankAccount("Shivam Dubey", 5000000, 2000000);
        obj.deposit(5000000);
        obj.withdraw(200000);
        obj.balance_check();

    }
}
