import junit.framework.TestCase;

import java.util.Arrays;

public class TwoSumTest extends TestCase {

    public void testExample1(){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] actualPrices = Main.Solution.twoSum(nums, target);
        int[] expectedPrices = {0, 1};
        assertEquals(Arrays.toString(expectedPrices), Arrays.toString(actualPrices));
    }

    public void testExample2(){
        int[] nums = {3,2,4};
        int target = 6;
        int[] actualPrices = Main.Solution.twoSum(nums, target);
        int[] expectedPrices = {1, 2};
        assertEquals(Arrays.toString(expectedPrices), Arrays.toString(actualPrices));
    }

    public void testExample3(){
        int[] nums = {3,3};
        int target = 6;
        int[] actualPrices = Main.Solution.twoSum(nums, target);
        int[] expectedPrices = {0, 1};
        assertEquals(Arrays.toString(expectedPrices), Arrays.toString(actualPrices));
    }
}