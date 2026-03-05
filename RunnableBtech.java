class RunnableBtech implements Runnable {
    String name;
    RunnableBtech(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println(name+" is a student of Quantum University");
    }
}

class Main{
    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableBtech("Shivam"));
        Thread t2 = new Thread(new RunnableBtech("Altaf"));
        Thread t3 = new Thread(new RunnableBtech("Ritesh"));

        t1.start();
        t2.start();
        t3.start();

    }
}
