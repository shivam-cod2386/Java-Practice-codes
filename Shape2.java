interface Shape2 {
    public void area();
    public void perimeter();
    
}

class Circle implements Shape2{
    int radius;
    Circle(int radius){
        this.radius = radius;

    }
    @Override
    public void area(){
        double ac = 3.14*(radius*radius);
        System.out.println("Area of Circle: "+ac);
    }
    @Override
    public void perimeter(){
        double pc = (2*3.14)*radius;
        System.out.println("Perimenter of Circle: "+pc);
    }
}
class Rectangle implements Shape2{
    int length;
    int breadth;
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void area(){
        double ar = length*breadth;
        System.out.println("Area of Rectangle: "+ar);
    }
    @Override
    public void perimeter(){
        double pr = 2*(length+breadth);
        System.out.println("Perimenter of Rectangle: "+pr);
    }
}

class Main{
    public static void main(String[] args){
        Circle c = new Circle(9);
        c.area();
        c.perimeter();
        Rectangle r = new Rectangle(6,7);
        r.area();
        r.perimeter();
    }
}