class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
    
    
        while(left < right) {

            while( right > left && !alphaNum(s.charAt(right))){
            right--;
            }

            while(left < right && !alphaNum(s.charAt(left))){
            left++;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            // else they are the same so keep going
            left++;
            right--;
        }

        // if we made it out here without needing to 
        // return false then its a valid palindrome
        return true;
    }

    private boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
         c >= 'a' && c <= 'z' ||
         c>= '0' && c <= '9');
    }
}
