public class PrintTCS extends Thread {
  
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println("TCS NQT");
        }
    }
    
}

class Main{
    public static void main(String[] args) {
        PrintTCS a = new PrintTCS();
        a.start();
    }
}
