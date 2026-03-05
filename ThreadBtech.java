class ThreadBtech extends  Thread{
    String name;
    ThreadBtech(String name){
        this.name = name;
    }
    public void run(){
        System.out.println(name+" is a student of Quantum University");
    }
}

class Main{
    public static void main(String[] args) {
        ThreadBtech b1 = new ThreadBtech("Shivam");
        ThreadBtech b2 = new ThreadBtech("Altaf");
        ThreadBtech b3 = new ThreadBtech("Ritesh");

        b1.start();
        b2.start();
        b3.start();
    }

}
