class Solution {
    public int[] twoSum(int[] nums, int target) {
        // hashmap that the keys indices and the values 
        //are nums of the array
        //loop over nums if nums[i] if hashmap contains target minu
       // if target minus nums[i] is in the hashmap then return indicies

       HashMap<Integer, Integer> complementHS = new HashMap<>();

       for(int i = 0; i < nums.length; i++){
        int complement = target - nums[i];

         if(complementHS.containsKey(complement)){
            return new int []{complementHS.get(complement), i};
         }
         complementHS.put(nums[i], i);
       }

       return new int[0];
    }
}
