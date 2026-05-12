class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // the main concept is we check if matches is 26 for every window,
        // we don't need to go through all elemnts again, just the one we add plus take away 
        // for the window
        // the window keeps that the letters are next to eachother
        if(s1.length() > s2.length()) {
            return false;
        }

        int k = s1.length();
        int [] freqs1 = new int [26];
        int [] freqs2 = new int [26];

        for(int i = 0; i < s1.length(); i++) {
            freqs1[s1.charAt(i) - 'a']++;

            // fill for first window of size s1.length
            freqs2[s2.charAt(i) - 'a']++;
        }
        
        int matches = 0;
        for(int i = 0; i < 26; i++) {
            if(freqs1[i] == freqs2[i]) {
                // we first we how many we match with the first window
                matches++;
            }
        }
      
        int left = 0;

        for(int right = k; right < s2.length(); right++) {
            
            if(matches == 26) {
                return true;
            } 

            // index in alphabet array
            // add this element to our window
            int index = s2.charAt(right) - 'a';
            freqs2[index]++;
            if(freqs1[index] == freqs2[index]) {
                matches++;
            } else if(freqs1[index] + 1 == freqs2[index]) {
                matches--;
            }

            index = s2.charAt(left) - 'a';
            freqs2[index]--;
            if(freqs1[index] == freqs2[index]) {
                matches++;
            } else if(freqs1[index] - 1 == freqs2[index]) {
                matches--;
            }
            left++;

        }
        return matches == 26;
    }
}
