public class SumAvg {
    private int a;
    private int b;
    private int c;
    public void setMarks(int x,int y, int z){
        a = x;
        b = y;
        c = z;
    }
    public int getSum(){
        int sum;
        

        sum = a+b+c;
        
        return sum;  

    }

    public int getAvg(){
        int avg;
        avg  = (a+b+c)/3;
        return avg;
    }
}   
class Main{
    public static void main(String[] args) {
        SumAvg obj = new SumAvg();
        obj.setMarks(5,6,7);
        int sum = obj.getSum();
        int avg = obj.getAvg();
        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + avg);
    }
}
  

