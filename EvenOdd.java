public  class EvenOdd extends Thread {

public void run(){
    for(int i =1; i<=10; i++){
        try {
            if(i%2==0){      
            Thread.sleep(2000);
            System.out.println("Even");       
    }

    else{


            System.out.println("Odd");  
    }
            
        } 
        catch (Exception e) {
            System.err.println("Error");
        }      
}
    
}
}

class Main{
    public static void main(String[] args) {
        EvenOdd e = new EvenOdd();
        EvenOdd f = new EvenOdd();
        System.err.println("Before Execution");
        e.isAlive();
        System.out.println(e.getState());;
        e.setName("Shivam 1");
        e.getName();
        e.start();
        e.interrupt();
        try {
            e.join();
            
            
        } 
        catch (Exception E) {
            System.err.println("Error");
        }
        System.out.println(f.getState());;
        f.setName("Shivam 2");
        System.out.println(f.getName());
        f.setPriority(1);
        f.start();
        f.interrupt();
        try {
            f.join();
            
        } catch (Exception E) {
            System.err.println("Error");
        }
        System.out.println("After Execution");
        f.isAlive();
    }
}
