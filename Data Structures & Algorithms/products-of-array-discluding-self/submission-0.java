class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] res = new int [nums.length];
        res[0] = 1;

        for(int i = 1; i < nums.length; i++) {
            // multiply the prefix of the previous number with 
            // the previous number because we are computing the 
            // prefix up until our current spot (i.e not including out current spot)
            res[i] = res[i - 1] * nums[i - 1];
        }

        // we need a postifx variable because the array now stores the answer
        // prefix was stored as we built it
        int postfix = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            res[i] *= postfix;
            postfix *= nums[i];
        }

        return res;

        


    }
}  
