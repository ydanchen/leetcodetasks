package arrays.moveZeroes;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order
 * of the non-zero elements.
 * <p>
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 * <p>
 * Note:
 *      1. You must do this in-place without making a copy of the array.
 *      2. Minimize the total number of operations.
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length <= 1) return;
        int zerocount = 0;
        for (int num : nums) if (num == 0) zerocount++;
        if (zerocount == 0)
            return;
        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] == 0)
                while (nums[i] == 0 && zerocount != 0) {
                    System.arraycopy(nums, i + 1, nums, i, nums.length - 1 - i);
                    zerocount--;
                    nums[nums.length - 1] = 0;
                }
    }
}
