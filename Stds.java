abstract class Stds {
    String name;
    int roll;
    Stds(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    
    abstract void attendClass();
    abstract void giveExam();

    void registered(){
        System.out.println(name+ " Yes");
    }
}

class ClgStd extends Stds{
    ClgStd(String name, int roll){
        super(name, roll);
    }

    @Override
    void attendClass(){
        System.out.println(name+" Yes "+roll);
    }

    @Override
    void giveExam(){
        System.out.println(name+ " No "+ roll);
    }
}

class Main{
    public static void main(String[] args){
        Stds obj = new ClgStd("Shivam", 55);
        obj.registered();
        obj.attendClass();
        obj.giveExam();
    }
}
