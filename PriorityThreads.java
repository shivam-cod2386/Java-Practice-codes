public class PriorityThreads extends Thread{

    public void run(){
        System.out.println("Hello, I'm Shivam");
    }
    
}

class Main{
    public static void main(String[] args) {
        PriorityThreads p1 = new PriorityThreads();
        PriorityThreads p2 = new PriorityThreads();
        PriorityThreads p3 = new PriorityThreads();
        
        p1.start();
        p2.start();
        p3.start();

        p1.setPriority(1);
        p2.setPriority(2);
        p3.setPriority(3);
    }
}
