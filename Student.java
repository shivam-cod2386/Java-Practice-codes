// Base class
class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}


class Marks extends Student {
    int marks;

    Marks(String name, int rollNo, int marks) {
        super(name, rollNo);
        this.marks = marks;
    }

    void displayMarks() {
        System.out.println("Marks: " + marks);
    }
}

// Sports interface (to simulate multiple inheritance)
interface Sports {
    int getSportsPoints();
}

// Result class inherits from Marks and implements Sports
class Result extends Marks implements Sports {
    int sportsPoints;

    Result(String name, int rollNo, int marks, int sportsPoints) {
        super(name, rollNo, marks);
        this.sportsPoints = sportsPoints;
    }

    // Implement interface method
    public int getSportsPoints() {
        return sportsPoints;
    }

    void displayResult() {
        displayStudent();
        displayMarks();
        System.out.println("Sports Points: " + sportsPoints);
        System.out.println("Total Score = " + (marks + sportsPoints));
    }
}

// Driver class
class Main {
    public static void main(String[] args) {
        Result r = new Result("Alice", 101, 85, 15);
        r.displayResult();
    }
}
