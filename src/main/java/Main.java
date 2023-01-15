import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(Solution.twoSum(nums, target)));

    }

    public static class Solution {
        public static int[] twoSum(int[] nums, int target) {
            int diff;
            for (int i = 0; i < nums.length; i++) {
                diff = target - nums[i];
                for (int j = 0; j < nums.length; j++) {
                    if (diff == nums[j] && i != j) {
                        return new int[]{i, j};
                    }
                }
            }
            return new int[2];
        }
    }
}
