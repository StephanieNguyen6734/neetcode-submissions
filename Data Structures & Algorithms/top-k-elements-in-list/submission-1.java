class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        /***
        [1, 2, 2, 3, 3, 3]
        array
        freq     1,       2     3
        List     [1]     [2]     [3]
        note: this array is only as big as the input array O(N)
        because the most a frequency can be is the number of n
        so start at the end of the array
        ------
        make a hashmap to count the frequency and also a array where the index is
        the frequency and the value is a list of numbers that appear with tht frequency
        this is good because the largest the array will be is the frequency of a number 
        aka n so its n space

        then we build a resulting array of size k 
        iterate from the end of the array freq and get the elements until we reach size k

        ***/

        HashMap<Integer, Integer> freq = new HashMap<>();
        
        // counting frequency 1 -> 2    2 --> 5
        for(int num: nums) {
            freq.putIfAbsent(num, 0);
            freq.put(num, freq.get(num) + 1);
        }

        // must make a list that holds an arraylist at each index
        // the indexes follow the values so we must do plus one because we don't need 0 based indexing, not even 0 necessary
        ArrayList<Integer>[] bucket = new ArrayList[nums.length + 1];

        // iterate through map to build bucket list
        for(int valueKey: freq.keySet()) {
            int frequencyIndex = freq.get(valueKey);
            if (bucket[frequencyIndex] == null) {
                bucket[frequencyIndex] = new ArrayList<>();
            }
            bucket[frequencyIndex].add(valueKey);
            
        }

        int [] result = new int[k];
        int kCounter = 0;

        for(int i = bucket.length -1; i > 0 && kCounter < k; i--) {
            if(bucket[i] != null) {
                for(int index = 0; index < bucket[i].size() && kCounter < k; index++) {
                    ArrayList<Integer> list = bucket[i];
                    result[kCounter] = list.get(index);
                    kCounter++;
                }
                
            }
        }

        return result;

    }
}
