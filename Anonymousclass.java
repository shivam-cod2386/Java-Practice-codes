interface Animal{
    void eat();
    void sleep();
}
class Main{
    public static void main(String[] args){
        Animal obj = new Animal(){
            @Override
            public void sleep(){
                System.out.println("So gya");
            }
            @Override
            public void eat(){
                System.out.println("Kha gya");
            }
        };
        obj.sleep();
        obj.eat();
    }
}
