import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsPractice {




    public static void main(String[] args) {
        ArrayList<String> marcoStudents1 = new ArrayList<>();
        System.out.println("upperLastElement(marcoStudents1) = " + upperLastElement(marcoStudents1));
        ArrayList<String> marcoStudents2 = new ArrayList<>(Arrays.asList("Shanshan"));
        System.out.println("upperLastElement(marcoStudents2) = " + upperLastElement(marcoStudents2));
        ArrayList<String> marcoStudents3 = new ArrayList<>(Arrays.asList("Vanessa", "Shanshan", "Nathan"));
        System.out.println("upperLastElement(marcoStudents3) = " + upperLastElement(marcoStudents3));
    }


    public static ArrayList<String> upperLastElement(ArrayList<String> names) {
        if (!names.isEmpty()) {
            String lastElement = names.get(names.size() - 1);
            names.set(names.size() - 1, lastElement.toUpperCase());
        }
        return names;




    }
}