/*
 * @lc app=leetcode id=977 lang=java
 *
 * [977] Squares of a Sorted Array
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int k = nums.length-1;

        int[] result = new int[nums.length];
        
        while(k >= 0) {
            if(Math.abs(nums[i]) < Math.abs(nums[j])) {
                result[k--] = nums[j] * nums[j];
                j--;
            } else {
                result[k--] = nums[i] * nums[i];
                i++;
            }
        }

        return result;
    }
}
// @lc code=end

