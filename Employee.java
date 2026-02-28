public class Employee {
   
    public void calculate_salary(String name, int base_salary, int bonus){
        String emp_name = name; 
        int total_salary = base_salary + bonus;
        System.out.println("The salary of the employee "+emp_name+" is "+ total_salary);
    }
}

class Main{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.calculate_salary("Shivam Dubey", 8000000, 1000000);
    }
}
