import java.util.*;;

public class HashSetExample {
    public static void main(String[] args) {
        String[] names = { "Abhi", "Ravi", "Pooja", "Abhi", "Ravi", "Neha" };
        Set<String> uniqueNames = new HashSet<>();
        for (String name : names) {
            uniqueNames.add(name);
        }
        System.out.println("Unique names are:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}
