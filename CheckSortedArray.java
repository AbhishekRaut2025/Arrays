// Check wearher the array is sorted or not
public class CheckSortedArray {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        boolean isAsc = true;
        boolean isDesc = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                isAsc = false;
            }
            if (numbers[i] < numbers[i + 1]) {
                isDesc = false;
            }
        }
        if (isAsc || isDesc) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
