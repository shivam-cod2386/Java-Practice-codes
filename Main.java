abstract class Animal {
    String sound;
    Animal(String sound){
        this.sound = sound;
    }
    public void Look(){
        System.out.println("It has four legs");
    }
    abstract void Sound();
}    
class Lion extends Animal{
    Lion(String sound){
        super(sound);
    }

    @Override 
    void Sound(){
        System.out.println("Lion " + sound);
    }
}
class Tiger extends Animal{
    Tiger(String sound){
        super(sound);

    }

    @Override
    void Sound(){
        System.out.print("Tiger " + sound);
    }
}

public class Main{
    public static void main(String[] args){
        Animal obj1 = new Lion("roars");
        Animal obj2 = new Tiger("roars");
        obj1.Look();
        obj1.Sound();
        obj2.Sound();


    }
}

