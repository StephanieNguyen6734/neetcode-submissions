
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> hashMap = new HashMap <>();
        for(int i = 0; i < strs.length; i++){
            char [] tocharArr = strs[i].toCharArray();
            Arrays.sort(tocharArr);
            String sorted = String.valueOf(tocharArr);

            if(!hashMap.containsKey(sorted)){
                hashMap.put(sorted, new ArrayList<>());
            }
            hashMap.get(sorted).add(strs[i]);
        }

        return new ArrayList<>(hashMap.values());
    }
}
