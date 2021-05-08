//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.List;
//
//public class CollectionsLecture {
//
//    public static void printEachElement(ArrayList<String> strings) {
//        for (String str : strings) {
//            System.out.println(str);
//        }
//    }
//
//    public static void main(String[] args) {
//
//        ArrayList<String> Strings = new ArrayList<>();
//        Strings.add("Kelvon");
//
//
//        // ----------------------------- Array Lists
//
//        // Creating Array Lists and Getting Elements
//
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//
////        System.out.println(numbers); // used to peek into the list
////        System.out.println(numbers.get(0));
//
//
////        ArrayList<String> strings = new ArrayList<>();
////        strings.add("bob");
////        strings.add("hello");
////        strings.add("etc");
//
////        System.out.println(strings);
////        System.out.println(strings);
//
//        // Creating ArrayList with Arrays.asList()
//
////        ArrayList<String> names = new ArrayList<>(Arrays.asList(
////                "Fred",
////                "Sally",
////                "Cindy"
////        ));
////
////        System.out.println(names);
//
//        // Getting Elements by Index Number
//
////        ArrayList<String> names = new ArrayList<>(Arrays.asList(
////                "Fred",
////                "Sally",
////                "Cindy"
////        ));
////
////        System.out.println(names.get(2));
////        System.out.println(names.get(5)); // ?
//
//
//        // Adding & Editing Elements
//
////        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
////        numbers.add(20);
////        System.out.println(numbers);
////        numbers.add(0, 21); // expands the array size
////        System.out.println(numbers);
////        numbers.set(0, 7); // edits the value at that index
////        System.out.println(numbers);
////        numbers.add(10, 22); // ???
////        System.out.println(numbers);
////
////        System.out.println(numbers.size());
//
//
//        // Removing Elements
//
////        ArrayList<String> names = new ArrayList<>(Arrays.asList(
////                "Fred",
////                "Sally",
////                "Cindy"
////        ));
////        System.out.println(names);
////        names.remove(0);
////        System.out.println(names);
//
////        names.remove("Cindy");
////        System.out.println(names);
//
//        // Removing Number by Value or Index
//
////        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
////        numbers.remove(2);
////        numbers.remove(Integer.valueOf(2)); // remove by value of the number
////        System.out.println(numbers);
//
//        // reordering list
//
////        Collections.sort(numbers);
////        Collections.reverse(numbers);
////        System.out.println(numbers);
//
//        // Additional Methods
//
////        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
////        System.out.println(numbers.size());
////        System.out.println(numbers.indexOf(3));
////        System.out.println(numbers.indexOf(105)); // ???
////
////        ArrayList<String> roasts = new ArrayList<>();
////        roasts.add("medium");
////        roasts.add("light");
////        roasts.add("medium");
////        roasts.add("dark");
////        System.out.println(roasts);
////        System.out.println(roasts.contains("dark"));
////        System.out.println(roasts.contains("espresso"));
////        System.out.println(roasts.lastIndexOf("medium"));
////        System.out.println(roasts.isEmpty());
//
//        ArrayList<String> Strings2 = new ArrayList<>();
//
//        ArrayList<String> names1 = new ArrayList<>(Arrays.asList("Justin, "Douglas", "Kenneth"));
//
//        /*
//            TODO:
//               1. Create a class called CollectionsPractice with a main method.
//               2. Create a static method, upperLastElement, that takes in an array list and
//                  returns the array list with last string capitalized. An empty array list
//                  should be returned if the passed array list is empty. If the passed array
//                  list only has one string, capitalize it.
//               3. In the main method, create an array list of first name strings of three people in Marco.
//               4. Test the upperLastElement method on your array of Marco people.
//               Examples
//               ArrayList<String> names1 = new ArrayList<>(Arrays.asList("Justin, "Douglas", "Kenneth"));
//               upperLastElement(names) should return "Justin", "Douglas", "KENNETH"
//               ArrayList<String> names2 = new ArrayList<>(Arrays.asList("Kenneth"));
//               upperLastElement(names2) should return "KENNETH"
//               ArrayList<String> names3 = new ArrayList<>();
//               upperLastElement(names3) should return an empty array list */
//
//    }
//
//}
////
////class CollectionsPractice {
////    private static String Douglas;
////
////    public static void upperLastElement(String[] args){
////        ArrayList<String> names1 = new ArrayList<>(Arrays.asList("Justin, "Douglas", "Kenneth"));
////
////    }
////
////    upperLastElement();
////
////}
//
//
//        // List vs. ArrayList (Polymorphism)
//
////        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("bob", "steve", "justin"));
////        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("bob", "steve", "justin"));
////
////        printEachElement(linkedList);
//
//
//        // Java Generics
//
////        List unsafe = new ArrayList();
////        unsafe.add(new Object());
////        unsafe.add(3);
////        unsafe.add("hello");
////        unsafe.add(true);
////
////        String str1 = (String) unsafe.get(2); // must explicitly cast
////        String str2 = (String) unsafe.get(0); // can lead to runtime exceptions
//
//        // ----------------------------- Hash Maps
//
//        // creating hash maps
//
////        Map<String, String> usernames = new HashMap<>();
////        usernames.put("Ryan", "ryanorsinger");
////        usernames.put("Luis", "MontealegreLuis");
////        usernames.put("Zach", "zgulde");
////        usernames.put("Fernando", "fmendozaro");
////        usernames.put("Justin", "jreich5");
////        System.out.println(usernames);
//
//        // getting values from and info about hash map
//
////        System.out.println(usernames);
////        System.out.println(usernames.get("Justin"));
////        System.out.println(usernames.get("Phillip"));
////        System.out.println(usernames.get("Justin"));
////        System.out.println(usernames.getOrDefault("Fred", "gocodeup"));
////        System.out.println(usernames.containsKey("Luis"));
//
//        // updating hash maps
//
////        usernames.put("Ryan", "rorsinger");
////        System.out.println(usernames);
////        System.out.println(usernames);
////        usernames.put("Ryan", "Test");
////
////        usernames.putIfAbsent("Zach", "coderdude24");
////        System.out.println(usernames);
////        usernames.replace("Ryan", "torvalds"); // same as put
////        System.out.println(usernames);
//
//        // removing pairs from hash map
//
////        System.out.println(usernames.remove("Zach"));
////        System.out.println(usernames);
////        System.out.println(usernames.remove("Zach"));
////        System.out.println(usernames);
////        System.out.println(usernames);
////        usernames.clear();
////        System.out.println(usernames);
////        System.out.println(usernames.isEmpty());
//
