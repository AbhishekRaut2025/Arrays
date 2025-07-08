import java.util.*;

public class FindUnion {
    public static void main(String[] args) {
        int[] numbers1 = { 1, 2, 3, 4, 5, 6 };
        int[] numbers2 = { 1, 2, 3, 4, 5 };
        Set<Integer> unionSet = new HashSet<>();
        for (int num : numbers1) {
            unionSet.add(num);
        }
        for (int num : numbers2) {
            unionSet.add(num);
        }
        System.out.println("Union array is:");
        for (int num : unionSet) {
            System.out.print(num + " ");
        }
    }
}
