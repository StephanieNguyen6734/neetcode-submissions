class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[] res = new int [2];

        // first we need to move the right pointer so its at a number that 
        // is not greater than the target
        // loop to move inward is that left < right
        // try left + right if sum bigger than target move right--;
        // try left + right if sum less than target move left++;
        // [1, 3, 4, 8, 9]
        // while(numbers[right] > target) {
        //     right--;
        // }

        while(left < right) {
            if(numbers[left] + numbers[right] > target) {
                right--;
            }else if (numbers[left] +  numbers[right] < target) {
                left++;
            } else { // the sum is equal to target if its not less or greater
                res[0] = left + 1;
                res[1] = right + 1;
                break;
            }  
        }

        return res;
    }
}
