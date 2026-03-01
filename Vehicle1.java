public class Vehicle1 {
    public void display(){
        System.out.println("Vehicle Information");
    }
}

class Car extends Vehicle1{
    
    public void mileage(){
        System.out.println("Mileage of Car is 20km/l");
    }
}

class Bike extends Vehicle1{
    
    public void mileage(){
        System.out.println("Bike gives a mileage of 50km/l");
    }
}

class Main{
    public static void main(String[] args) {
        Car a1 = new Car();
        a1.display();
        a1.mileage();
        Bike a2 = new Bike();
        a2.mileage();
    }
}
