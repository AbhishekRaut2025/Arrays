// Find missing number in array
public class FindMissingNumber {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
        int n = 10;
        int expectedSum = (n * (n + 1) / 2);
        int actualSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            actualSum += numbers[i];
        }
        int missingNumber = expectedSum - actualSum;
        if (missingNumber == 0) {
            System.out.print("There is no missing number");
        } else {
            System.out.print("The missing number is : " + missingNumber);
        }
    }
}
