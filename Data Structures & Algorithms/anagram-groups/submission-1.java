class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // iterate through strs then sort each string
        //key of hashmap will be the sorted string
        //value will be the list of strings
        //print out the hashmap values
        HashMap<String, ArrayList<String>> anagrams = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            char [] word = strs[i].toCharArray();
            Arrays.sort(word);
            String sorted = new String(word);

        // stephanie's old way
        //    ArrayList<String> anagramFamily = anagrams.getOrDefault(sorted, new ArrayList<String>());
        //    anagramFamily.add(strs[i]);

        //    anagrams.put(sorted, anagramFamily);

        // newer way
        anagrams.putIfAbsent(sorted, new ArrayList<>());
        anagrams.get(sorted).add(strs[i]);

        }

        return new ArrayList<>(anagrams.values());


    }
}
