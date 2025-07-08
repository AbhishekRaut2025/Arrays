// linear search means take a number and find when it occured in array
public class LinearSearch {
    public static void main(String[] args) {
        int num = 5;
        int findIndex = -1;
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == num) {
                findIndex = i;
                break;
            }
        }
        if (findIndex != -1) {
            System.out.println("Element found at index no. " + findIndex);

        } else {
            System.out.println("No element found in array");
        }
    }
}
