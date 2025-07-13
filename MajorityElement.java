public class MajorityElement {
    public static int findMajority(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }

            if (count > n / 2) {
                return nums[i];
            }
        }

        return -1;                                           // this is when there is No majority element
    }

    public static void main(String[] args) {
        int[] numbers = {2, 2, 1, 2, 3, 2, 2};
        int result = findMajority(numbers);
        System.out.println("Majority Element is: " + result);
    }
}
