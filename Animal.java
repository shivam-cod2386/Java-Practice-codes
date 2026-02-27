interface Animal{
    void Eat();
    void Sleep();
}
class Lion implements Animal{
    @Override
    public void Eat(){
        System.out.println("Lion Eats Meat");
    }
    @Override
    public void Sleep(){
        System.out.println("Lion sleep in cave");
    }
}
class Main{
    public static void main(String[] args) {
        Animal obj = new Lion();
        obj.Eat();
        obj.Sleep();
    }
}
