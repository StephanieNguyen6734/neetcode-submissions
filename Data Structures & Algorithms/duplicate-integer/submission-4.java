class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> prevNums = new HashSet<>();
        for( int i = 0; i < nums.length; i++) {
            if(prevNums.contains(nums[i])) {
                return true;
            }
            prevNums.add(nums[i]);
        }

        return false;
    }
}