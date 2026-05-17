class Solution {
    public boolean isPalindrome(String s) {
        /***
        two pointers one starting at the fron one in the back
        skip if no A-Z or a-z or 0-9
        ***/

        int left = 0;
        int right = s.length()-1;
        while(left < right) {
            if(!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            } else {
                char l = Character.toLowerCase(s.charAt(left));
                char r = Character.toLowerCase(s.charAt(right));
                if( l != r ){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
