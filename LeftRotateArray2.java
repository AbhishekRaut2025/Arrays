import java.util.*;
import java.util.Scanner;

public class LeftRotateArray2 {

    public static void LeftRotate(int[] arr, int d) {
        int n = arr.length;
        for (int i = 0; i < d; i++) {
            int first = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + " : ");
            numbers[i] = sc.nextInt();
        }

        System.out.print("Your array is : ");
        for (int val : numbers) {
            System.out.print(val + " ");
        }

        int d = 2;
        LeftRotate(numbers, d);

        System.out.println("\nLeft rotated array by " + d + " places: ");
        for (int val : numbers) {
            System.out.print(val + " ");
        }
    }
}
