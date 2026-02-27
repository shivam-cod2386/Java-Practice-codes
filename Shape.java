class Area{
    int r;
    int l;
    int b;

    Area(int r ){
        this.r = r;
    }

    Area(int l, int b){
        this.l = l;
        this.b = b;
    }

    public void area(){
            double areacircle = 3.14 * r * r;
            System.out.println(areacircle);
        
    
            double arearectangle = l * b;
            System.out.println(arearectangle);
        
    }
}

class Main{
    public static void main(String[] args){
        Area a = new Area(5,6);
        Area b = new Area(5);
        a.area();
        b.area();
    }
}