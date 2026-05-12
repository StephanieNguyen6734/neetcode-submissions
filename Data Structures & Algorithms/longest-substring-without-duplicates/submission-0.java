class Solution {
    public int lengthOfLongestSubstring(String s) {
        //classic dynamic window sliding pattern.
        // for loop to be right pointer 
        // constrain left by left++ when we see a duplciate character 
        // check duplicate with a set

        HashSet<Character> letterSet = new HashSet<>();
        int left = 0;
        int maxString = 0;

        for(int right = 0; right < s.length(); right++) {
       
            while(letterSet.contains(s.charAt(right))){
                letterSet.remove(s.charAt(left));
                left++;
            }

            letterSet.add(s.charAt(right));
            maxString = Math.max(maxString, right - left + 1 );
        }
        return maxString;
    }
}
