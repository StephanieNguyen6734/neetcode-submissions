class Solution {
    public int longestConsecutive(int[] nums) {
        /***
        int consecMax = 0
        set[2]
        [2, 20, 4, 10, 3, 4, 5]
        nums[i] + 1, or nums[i] -1

        how do we distinguish between different chains of consec
        consec is like pair or triplet one below and one above?
        [1, 2, 3, 12, 13, 6, 7, 8, 9]
        [1, 2, 3] - 3
        
        [6, 7, 8, 9] -4 

        if the length is bigger than the curr max then this is the new max
        smallest number is the indication that new chain
        the list grows but so does the count, how do we track
        ***/


        HashSet<Integer> seen = new HashSet<>();

        for(int num: nums){
            seen.add(num);
        }
        int max = 0;
        int length = 1;
        for(int i = 0; i < nums.length; i++) {
            if(!seen.contains(nums[i] - 1)) {
                // start chain
                int num = nums[i];
                num+=1;
                 length = 1;
                while(seen.contains(num)) {
                   
                    length++;
                    num+=1;
                }

                if(length > max) {
                    max = length;
                }
            }
        
        }

        return max;
    }
}
