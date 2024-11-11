/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] firstArray = s.toCharArray();
        char[] secondArray = t.toCharArray();

        int i = 0;
        int j = 0;

        while(i < firstArray.length && j < secondArray.length) {
            
            if(firstArray[i] == secondArray[j]) {
                i++;
            } 
            
            j++;
        }

        return i == firstArray.length;
    }
}
// @lc code=end

