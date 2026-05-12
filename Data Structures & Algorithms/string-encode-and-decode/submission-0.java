class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();

        for(String s: strs){
            res.append(s.length()).append("#" ).append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0; // what position we are at, in the input string

        while( i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#'){
                j ++;
            }

            // this length variable now tells us how many letters we
            // have to read for the first word
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1; // first letter of word
            j = i + length;
            res.add(str.substring(i, j));
            i = j;
        }
        return res;
    }
}
