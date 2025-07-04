// take array input from user Check wearher the array is sorted or not if the array is not sorted then sort the array and print it
import java.util.*;
public class CheckUsersArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int a = sc.nextInt();
        int[] numbers = new int[a];
        for(int j = 0; j<numbers.length; j++){
            System.out.print("Number "+j+" = ");
            numbers[j]= sc.nextInt();
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
            System.out.println("Array is sorted");
        } else {
            System.out.print("Array is not sorted, Do you want to sort the array (yes/no): ");
            char userInput;
            boolean isValidInput = false;
            while(!isValidInput){
                userInput = sc.next().charAt(0);
                if(userInput=='y')
            }
        }
  


    sc.close();        
    }
}
