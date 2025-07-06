import java.util.Scanner;

public class MoveZerosToEnd {
    public static void moveZeros(int[] arr) {
        int n = arr.length;
        int index = 0; // Position to place the next non-zero

        // Move non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaining positions with 0
        while (index < n) {
            arr[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + " : ");
            numbers[i] = sc.nextInt();
        }

        System.out.print("Original array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        moveZeros(numbers);

        System.out.println("\nArray after moving zeros to the end:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
