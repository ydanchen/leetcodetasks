package arrays.twoSum;

/**
 * 1. Two Sum
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class Solution {
    /**
     * Should be improved to O(n) complexity
     */
    public int[] twoSum(int[] nums, int target) {
        int[] emptyIndexes = new int[]{};
        if (nums.length < 2)
            return emptyIndexes;

        for (int i = 0; i < nums.length - 1; i++)
            for (int j = i; j < nums.length; j++) {
                if (i == j) continue;
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }

        return emptyIndexes;
    }
}
