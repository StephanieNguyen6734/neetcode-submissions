class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numsHS = new HashSet<>();

        int maxLength = 0;

        // add numbers to hashset
        for(int i = 0; i < nums.length; i++){
            numsHS.add(nums[i]);
        }

        for(int i = 0; i < nums.length; i++) {
            // first check if number can be the start of a consecutive
            // if does not have a number before it then its a start if not move on
            if(!numsHS.contains(nums[i] - 1)) {
                int current = nums[i];
                int length = 1;
                while(numsHS.contains(current + 1)){
                    length++;
                    current++;
                }
                maxLength = Math.max(maxLength, length);
               
            }
        }

        return maxLength;
    }
}
