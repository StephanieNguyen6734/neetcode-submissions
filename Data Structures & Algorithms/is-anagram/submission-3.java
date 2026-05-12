
class Solution {
    public boolean isAnagram(String s, String t) {
       // calculate the frequency of one string
       // use that hash map and check if that letter is present and subtrat
       //check if frequencies are zero
       HashMap<Character, Integer> freq = new HashMap<>();

       for(int i = 0; i < s.length(); i++){
        freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);
       }

       for(int i = 0; i < t.length(); i++){
        freq.put(t.charAt(i), freq.getOrDefault(t.charAt(i), -1) - 1);
       }

       //check hashmap now if all is zero
       for(Character letter: freq.keySet()){
        if(freq.get(letter) != 0){
            return false;
        }
       }
       return true;
    }
}
