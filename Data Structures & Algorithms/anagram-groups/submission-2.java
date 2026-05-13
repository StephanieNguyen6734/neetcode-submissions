
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // [[hi, ih], [hello, elloh]]
        /***
        String key = the letters in a sorted way O(nlogn)
        value = list of strings for each anagram word --> cat, act
        map <String, List<String>>
        iterate to return map.values
        ***/
        HashMap<String, List<String>> anagramMap = new HashMap<>();

        for(String word: strs) {
            char[] sortedWord = word.toCharArray();
            Arrays.sort(sortedWord);
            String wordKey = new String(sortedWord);

            anagramMap.putIfAbsent(wordKey, new ArrayList<>());
            anagramMap.get(wordKey).add(word);
        }

        return new ArrayList<>(anagramMap.values());
    }
}
