 import java.util.LinkedList;

public class prac32 {

    // Generic method
    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {
        // Test with Integer roll numbers
        LinkedList<Integer> rollNumbers = new LinkedList<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);

        // Test with String names
        LinkedList<String> names = new LinkedList<>();
        names.add("Rahul");
        names.add("Priya");
        names.add("Amit");

        System.out.println("Roll No 102 found: " + searchElement(rollNumbers, 102));
        System.out.println("Name Priya found: " + searchElement(names, "Priya"));
        System.out.println("Name Neha found: " + searchElement(names, "Neha"));
    }
}
    
}
