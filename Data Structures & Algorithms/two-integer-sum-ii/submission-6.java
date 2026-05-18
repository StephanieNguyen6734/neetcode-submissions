class Solution {
    public int[] twoSum(int[] numbers, int target) {
        /***
        sorted array [1, 2, 3, 4] target = 6
        not 0 based indexing so add one at the end
        left point for loop 
        right pointer only checks to the right of it?
        4 element n^ 16
        [ ]
     
        ***/
      
       int left = 0;
       int right = numbers.length - 1;
       int sum = 0;

       while(left < right) {
            sum = numbers[left] + numbers[right];

            if(sum > target) {
                right--;
            } else if(sum < target) {
                left++;
            } else if(sum == target) {
                return new int [] {left+1, right+1};
            }

       }

        return new int []{};
        
    }
}
