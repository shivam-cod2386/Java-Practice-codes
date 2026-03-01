abstract class ShapeArea {
    public abstract  void area();
    
}

class Circle extends  ShapeArea{
    int radius;
    Circle(int radius){
        this.radius = radius;
    }
    @Override
    public void area(){
        double a1 = 3.14*(radius*radius);
        System.out.println("Area of Circle: "+a1);
    }
}

class Rectangle extends ShapeArea{
    int length;
    int breadth;
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public void area(){
        int a2 = length*breadth;
        System.out.println("Area of Rectangle: "+a2);
    }
}

class Triangle extends ShapeArea{
    int base;
    int hieght;
    Triangle(int hieght, int base){
        this.hieght = hieght;
        this.base = base;
    }
    @Override
    public void area(){
        double a3 = (0.5)*base*hieght;
        System.out.println("Area of Triangle: "+a3);
    }
}

class Main{
    public static void main(String[] args) {
        Circle obj1 = new Circle(5);
        obj1.area();
        Rectangle obj2 = new Rectangle(4,7);
        obj2.area();
        Triangle obj3 = new Triangle(5,9);
        obj3.area();
    }
}


