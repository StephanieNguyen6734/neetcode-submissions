class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] result = new int [nums.length];

        int prefix = 1;
        int postfix = 1;

        // prefix pass
        for(int i = 0; i < nums.length; i++) {
            if(i == 0) {
                result[0] = prefix;
            } else {
                prefix *= nums[i - 1];
                result[i] = prefix;
            }
        }

        // postfix pass
        for(int j = nums.length - 1; j >= 0; j--) {
            if(j == nums.length - 1) {
                result[nums.length - 1] = postfix * result[nums.length - 1];
            } else {
                postfix *= nums[j + 1];
                result[j] *= postfix;
            }
        }

        return result;
    }
}  
