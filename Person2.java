public class Person2 {
    public void display(){
        System.out.println("Person is the Parent class");
    }    
}
class Student extends Person2{
    @Override
    public void display(){
        super.display();
        System.out.println("Student is the child class");
    }

}

class Main{
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}