
// remove duplicates from sorted array
import java.util.*;

public class CheckDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("The array is empty.");
            return;
        
        }
        int[] numbers = new int[n];
        System.out.println("Enter array : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Element " + i + " : ");
            numbers[i] = sc.nextInt();
        }
        System.out.println("Your array is : ");
        for (int l = 0; l < numbers.length; l++) {
            System.out.print(numbers[l] + " ");
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
        int writeIndex = 1;
        for (int j = 1; j < numbers.length; j++) {
            if (numbers[j] != numbers[writeIndex - 1]) {
                numbers[writeIndex] = numbers[j];
                writeIndex++;
            }
        }
        System.out.println("\nArray after removing duplicates : ");
        for (int k = 0; k < writeIndex; k++) {
            System.out.print(numbers[k] + " ");
        }
        sc.close();
    }
}



