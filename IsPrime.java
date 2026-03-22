public class IsPrime extends Thread{

    public void run(){
        try{
             for (int num = 2; num <= 10; num++) {
                 boolean isPrime = true;

            
                 for (int i = 2; i <= num / 2; i++) {
                     if (num % i == 0) {
                         isPrime = false;
                         break;
                }
            }
                if (isPrime) {
                    Thread.sleep(2000);
                    System.out.println(num);
                }
        }
  

        }
        catch (Exception e) {
            System.out.println("Error");
        }
 }
}
class Main{
    public static void main(String[] args) {
        IsPrime c1 = new IsPrime();
        IsPrime c2 = new IsPrime();
        c1.setName("Altaf");
        System.out.println(c1.getName());
        System.out.println(c1.getState());
        c1.start();
        try {
            c1.join();
        } catch (Exception e) {
            System.out.println("Error");
        }
        System.out.println(c1.getState());
        c2.setName("Shivam");
        System.out.println(c2.getName());
        System.out.println(c2.getState());
        c2.start();
        System.out.println(c2.getState());
    }
}
