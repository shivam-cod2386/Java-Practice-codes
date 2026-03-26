import java.util.*;

class Arrlst{
    public static void main(String[] args) {
        ArrayList<String> langs = new ArrayList<>();

        langs.add("Java");
        langs.add("C++");
        langs.add("C#");
        langs.add("Python");

        System.out.println("Languages: " + langs);

        System.out.println("Printing each language:");
        for (String lang : langs) {
            System.out.println(lang);
        }
    }
}