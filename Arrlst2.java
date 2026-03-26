import java.util.*;

public class Arrlst2 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(15);
        marks.add(19);
        marks.add(11);
        marks.add(18);
        marks.add(17);

        marks.set(3, 16);
        marks.remove(4);

        Collections.sort(marks);

        System.out.println("All subjects marks: "+marks);
        }
    }
    
    

