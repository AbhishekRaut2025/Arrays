public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] numbers = { 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1 };
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else if (numbers[i] == 0) {
                count = 0;
            }
        }
        System.out.println("The Maximum Consecutive times Ones appeared are : " + maxCount);
    }
}
