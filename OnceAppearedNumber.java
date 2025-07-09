public class OnceAppearedNumber {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 2, 3, 1, 4, 5, 3, 4 }; // expected output: 5

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("The number that appeared once is: " + numbers[i]);
                break;
            }
        }
    }
}
