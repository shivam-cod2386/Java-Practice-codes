class Array2 extends Thread{
    int[] a;
    int start;
    int end;
    int sum;
    Array2(int s, int e, int[] a){
        this.a = a;
        this.start = s;
        this.end = e;
    }

    public void run(){
        sum = 0;
        for(int i = start; i<end; i++){
             sum +=  a[i];

        }
        
    }
    public int getSum(){
        return sum;
    }
}

class Main{
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int mid = a.length/2;
        Array2 a1 = new Array2(0,mid,a);
        Array2 a2 = new Array2(mid,a.length,a);
        a1.start();
        a2.start();
        try {
            a1.join();
            a2.join();

        } catch (Exception e) {
            System.out.println("Error");
        }

        int total = a1.getSum() + a2.getSum();
        System.out.println("Total sum: "+total);
    }
}