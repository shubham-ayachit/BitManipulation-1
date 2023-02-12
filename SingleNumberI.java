// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;

        for(int num : nums) {
            xor = xor^num;
        }

        return xor;
    }
}