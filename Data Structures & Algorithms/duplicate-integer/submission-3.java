class Solution {
    public boolean hasDuplicate(int[] nums) {
        //return true if we see a duplicate
        HashSet<Integer> numsHS = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(!numsHS.add(nums[i])){
                return true;
            }

        }

        return false;
    }
}
