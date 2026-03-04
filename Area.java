class Area {
    
    public void area(int side){
        int as = side*side;
        System.out.println("Area of Square: "+as);
    }

    public void area(int l, int b){
        int ar = l*b;
        System.out.println("Area of rectangle: "+ar);
    }

    public void area(double r){
        double ac = 3.14*(r*r);
        System.out.println("Area of Circle: "+ac);
    }
}
class Main{
    public static void main(String[] args) {
        Area a = new Area();
        a.area(6);
        a.area(4,5);
        a.area(3.0);
    }
}