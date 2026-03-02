interface Person {

    public void person();
}
interface Employee {
    public void employee();
}

class Manager implements  Person, Employee{
    @Override
    public void person(){
        System.out.println("The manager is a Person ");
    }
    @Override
    public void  employee(){
        System.out.println("The manager is an employee in the office");
    }
}

class Main{
    public static void main(String[] args) {
        Manager m = new Manager();
        m.person();
        m.employee();
    }
}
