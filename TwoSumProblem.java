// Given an array of integers numbers and an integer target, return indices of the two numbers such that they add up to target

public class TwoSumProblem {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 10 };
        int target = 6;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println("Indices " + i + " and " + j);
                    return;
                }
            }
        }
    }
}
