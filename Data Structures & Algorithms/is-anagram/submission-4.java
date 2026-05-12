class Solution {
    public boolean isAnagram(String s, String t) {

        /***
        same frequency in letters, count of letters matter
        **/

        if(s.length() != t.length()) {
            return false;
        }
           HashMap<Character,Integer> freq = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {

            char charS = s.charAt(i);
            char charT = t.charAt(i); 
            freq.put(charS, freq.getOrDefault(charS, 0) + 1 );
            freq.put(charT, freq.getOrDefault(charT, 0) - 1);
    
        }

        for( int values: freq.values()) {
            if(values != 0) {
                return false;
            }
        }
        return true;

        
    }
}
