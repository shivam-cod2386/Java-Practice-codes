import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Student {
    private String name;
    private int marks;

    // Constructor
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void writeToFile(String filename) {
        try {
            FileWriter fw = new FileWriter(filename, true); // append mode
            fw.write("Name: " + name + ", Marks: " + marks + "\n");
            fw.close();
            System.out.println("Data written successfully to " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file.");
            e.printStackTrace();
        }
    }
}

public class FileHandlingWithClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();

        Student s = new Student(name, marks);

        s.writeToFile("students.txt");

        sc.close();
    }
}
