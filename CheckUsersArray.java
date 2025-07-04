
// take array input from user Check wearher the array is sorted or not if the array is not sorted then sort the array and print it
import java.util.*;

public class CheckUsersArray {
    public static void printArray(int[] arr) {
    for (int num : arr) {
        System.out.print(num + " ");
    }
    System.out.println();
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int a = sc.nextInt();
        int[] numbers = new int[a];
        for (int j = 0; j < numbers.length; j++) {
            System.out.print("Number " + (j + 1) + " = ");
            numbers[j] = sc.nextInt();
        }
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
            System.out.println("Array is already sorted");
            System.out.print("Array : ");
            for (int k = 0; k < numbers.length; k++) {
                System.out.print(numbers[k] + " ");
            }
            System.out.println();
        } else {
            System.out.print("Array is not sorted, Do you want to sort the array (y/n): ");
            char userInput;
            boolean isValidInput = false;
            while (!isValidInput) {
                userInput = sc.next().charAt(0);
                if (userInput == 'y' || userInput == 'Y') {
                    isValidInput = true;
                    Arrays.sort(numbers);
                    for (int p = 0; p < numbers.length; p++) {
                        System.out.print(numbers[p] + " ");
                    }
                    System.out.print("\nYour array is now sorted.");
                } else if (userInput == 'N' || userInput == 'n') {
                    isValidInput = true;
                    System.out.println("Thanks");
                } else {
                    System.out.println("Please give valid input !");
                }
            }
        }
        sc.close();
    }
}
