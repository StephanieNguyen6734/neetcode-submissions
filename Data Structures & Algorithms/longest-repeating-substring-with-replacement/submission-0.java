class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;
        HashSet<Character> charSet = new HashSet<>();
        
        // add all unique characters to hashset, this will be our
        // options to track the most frequent letter in the current window
        for(char letter: s.toCharArray()) {
            charSet.add(letter);
        }

        for(char c : charSet) {
            int count = 0;
            int left = 0;

            // get the count of the current c in our window
            for(int right = 0; right < s.length(); right++) {
                if(s.charAt(right) == c) {
                    count++;
                }

                // exceeded our replacement condition, shrink window
                while((right - left + 1) - count > k) {
                    // this keeps count consistently updated if our window 
                    // shrinks
                    if(s.charAt(left) == c) {
                        count--;
                    }
                   left++; 
                }
                res = Math.max(res, right - left + 1);
                
            }
       
        
        }
         return res;

    }
}

