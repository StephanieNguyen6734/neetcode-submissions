class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       ArrayList<List<Integer>> res = new ArrayList<>();

        // sort array then it becomes 2 sum 2 problem
        Arrays.sort(nums);
        // outer loop to be our first num 
       for(int a = 0; a < nums.length; a++) {
        //if (nums[a] > 0) break; //
        if (a > 0 && nums[a] == nums[a - 1]) continue;//

        int left = a + 1;
        int right = nums.length - 1;

            while(left < right) {

                int sum = nums[left] + nums[right] + nums[a];
                if( sum < 0){
                    left++;
                } else if( sum > 0) {
                    right--;
                }else{ // sum equals all equal to 0
                    List triplet = new ArrayList<>();
                    triplet.add(nums[a]);
                    triplet.add(nums[left]);
                    triplet.add(nums[right]);

                    res.add(triplet);

                    left++; //
                    right--; //

                    //
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    
                }
            }
       }

    return res;
    }
}
