interface Vehicle{
    public void Speedup(int speed);
    public void applybrake(int speed);
}

class Car implements Vehicle{
    int initspeed = 0;
    int maxspeed;
    int finalspeed;
    @Override
    public void Speedup(int speed){
        maxspeed =  initspeed + speed;
        System.out.println(maxspeed);
    }

    @Override
    public void applybrake(int speed){
        finalspeed =  maxspeed - speed;
        System.out.println(finalspeed);
    }
}
class Main{
    public static void main(String[] args){
        Car c = new Car();
        c.Speedup(100);
        c.applybrake(40);
    }
}