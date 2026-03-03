// Card class
class Card {
    private String cardNumber;
    private String holderName;

    public Card(String cardNumber, String holderName) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getHolderName() {
        return holderName;
    }
}

// Bank class
class Bank {
    private double balance;

    public Bank(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
            return true;
        } else {
            System.out.println("Insufficient balance!");
            return false;
        }
    }
}

// Transaction class
class Transaction {
    private String type;
    private double amount;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public void process(Bank bank) {
        if (type.equalsIgnoreCase("deposit")) {
            bank.deposit(amount);
        } else if (type.equalsIgnoreCase("withdraw")) {
            bank.withdraw(amount);
        } else {
            System.out.println("Invalid transaction type!");
        }
    }
}

// ATM class
class ATM {
    private Card card;
    private Bank bank;

    public ATM(Card card, Bank bank) {
        this.card = card;
        this.bank = bank;
    }

    public void performTransaction(Transaction transaction) {
        System.out.println("Card Holder: " + card.getHolderName());
        transaction.process(bank);
    }
}

// Main class
public class ATMSystem {
    public static void main(String[] args) {
        Card card = new Card("1234-5678-9876", "Alice");
        Bank bank = new Bank(1000.0); // initial balance
        ATM atm = new ATM(card, bank);

        // Transactions
        Transaction t1 = new Transaction("deposit", 500);
        atm.performTransaction(t1);

        Transaction t2 = new Transaction("withdraw", 300);
        atm.performTransaction(t2);

        Transaction t3 = new Transaction("withdraw", 1500); // exceeds balance
        atm.performTransaction(t3);
    }
}

