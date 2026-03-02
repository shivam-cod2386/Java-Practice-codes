class ClassA {
    private int valueA;

    public ClassA(int v) {
        this.valueA = v;
    }
    int getValueA() {
        return valueA;
    }
}

class ClassB {
    private int valueB;

    public ClassB(int v) {
        this.valueB = v;
    }

    int getValueB() {
        return valueB;
    }
}

class Utility {
    static int addValues(ClassA a, ClassB b) {
        return a.getValueA() + b.getValueB();
    }
}

public class FriendFunctionDemo {
    public static void main(String[] args) {
        ClassA objA = new ClassA(10);
        ClassB objB = new ClassB(20);

        int sum = Utility.addValues(objA, objB);
        System.out.println("Sum = " + sum);
    }
}
