abstract  class Employee1 {

    abstract  void getSalary();
    
}

class Intern extends Employee1{
    int s1;
    Intern(int s1){
        this.s1 = s1;
    }
    @Override
    public void getSalary(){
        System.out.println("Salary of Intern: "+s1);
    }
}

class Manager extends Employee1{
    int s2;
    Manager(int s2){
        this.s2 = s2;
    }
    @Override
    public void getSalary(){
        System.out.println("Salary of Manager: "+s2);
    }
}

class Main{
    public static void main(String[] args) {
        Intern i = new Intern(15000);
        i.getSalary();
        Manager m = new Manager(200000);
        m.getSalary();

    }
}


