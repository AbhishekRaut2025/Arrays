public class SecondLargestElement{
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i<numbers.length; i++){
            int num = numbers[i];
            if(num>max){
                secondMax = max;
                max = num;
            }
            else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        System.out.println(secondMax);
    }
}