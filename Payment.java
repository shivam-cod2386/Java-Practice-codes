interface  Payment {

    abstract void makepayment();
}

class CreditCard implements Payment{
    @Override
    public void makepayment(){
        System.out.println("Made payment using Credit Card");
    }
}
class UPI implements Payment{
    @Override
    public void makepayment(){
        System.out.println("Made payemnt using UPI");
    }
}

class Main{
        public static void main(String[] args) {
            CreditCard c = new CreditCard();
            c.makepayment();
            UPI u = new UPI();
            u.makepayment();

        }
}
