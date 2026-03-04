// Encapsulated BankAccount class
class BankAccount{
    // Private fields (encapsulation)
    private String accountHolderName;
    private double balance;

    // Static variable to track total accounts created
    private static int accountCount = 0;

    // Constructor
    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        accountCount++; // Increment whenever a new account is created
    }

    // Getter methods (encapsulation)
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setter methods (encapsulation)
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Static method to access total accounts created
    public static int getAccountCount() {
        return accountCount;
    }
}

class Main{
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 5000);
        BankAccount acc2 = new BankAccount("Bob", 3000);
        BankAccount acc3 = new BankAccount("Charlie", 7000);

        // Display total accounts created
        System.out.println("Total accounts created: " + BankAccount.getAccountCount());
    }
}
