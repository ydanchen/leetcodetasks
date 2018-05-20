package arrays.moveZeroes;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order
 * of the non-zero elements.
 * <p>
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 * <p>
 * Note:
 * 1. You must do this in-place without making a copy of the array.
 * 2. Minimize the total number of operations.
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length <= 1) return;
        int zeroCount = 0;
        for (int num : nums) if (num == 0) zeroCount++;
        if (zeroCount == 0)
            return;
        int index = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] != 0)
                nums[index++] = nums[i];
        while (index < nums.length)
            nums[index++] = 0;
    }
}
