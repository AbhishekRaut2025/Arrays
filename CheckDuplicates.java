// remove duplicates from sorted array
import java.util.*;

public class CheckDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int n = sc.nextInt();
        if(n==0){
            System.out.println("The array is empty.");
            return;
        }
        int[] numbers = new int[n];
        System.out.println("Enter sorted array : ");
        for(int i = 0; i<numbers.length; i++){
            System.out.print("Element " + i + " : ");
            numbers[i] = sc.nextInt();
        }
        System.out.println("Your array is : ");
        for(int l = 0; l<numbers.length;l++){
            System.out.print(numbers[l]+ " ");
        }
        int writeIndex = 1;
        for(int j = 1; j<numbers.length; j++){
            if(numbers[j] != numbers[writeIndex-1]){
                numbers[writeIndex] = numbers[j];
                writeIndex++;
            }
        }
        System.out.println("\nArray after removing duplicates : ");
        for(int k = 0; k<writeIndex;k++){
            System.out.print(numbers[k]+ " ");
        }
    }
}
