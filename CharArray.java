class CharArray extends Thread {
    
        
    

    char[] a = {'A','B','C','D'};
    public void run(){

    

    for(int i = 0; i<=3; i++){

        System.out.println(a[i]);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            System.out.println("Exception interrupted");
        }
    }
}
}

class Main{
    public static void main(String[] args) {
        CharArray c = new CharArray();
        c.start();
    }
}
