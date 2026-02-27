abstract class BTech {
    abstract void section();
    public void Specialization(){
        System.out.println("We have AIML and Cyber-Security");
     } 
}

class College extends BTech{
    @Override
    public void section(){
        System.out.println("We haave 8 sections");
    }
}

class Main{
    public static void main(String[] args) {
        College c = new College();
        c.section();
        c.Specialization();
    }
}
