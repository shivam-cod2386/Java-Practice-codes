import java.util.*;
class Arrlst3{
    public static void main(String[] args){
        var s = new ArrayList<String>();
        s.add("Python");
        s.add("C++");
        s.add("Java");
        s.add("R");
        s.add("C");
        s.add("SQL");
        Collections.sort(s);
        s.set(5,"Oracle");
        s.remove(3);
        System.out.println("List of Subjects in B.Tech: ");
        for(int i = 0; i<s.size(); i++){
            System.out.println(s.get(i));
        }
    
    }
}
