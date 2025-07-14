// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target Using  [HashMap]
import java.util.HashMap;

public class TwoSumProblem2 {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                System.out.println("Indices: " + map.get(complement) + " and " + i);
                return;
            }
            map.put(nums[i], i);
        }
    }
}
