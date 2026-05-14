class Solution {
/***
okay encoding we need get a list of strings, at first i thought a delimter
but the issue is all 256 ascii are valid
the length of the word if before the word so that later 
in decode, we know how long our word will be
5hello5world
encode:
5#hello, could be #5 but is more natural to have length then # 
as a delimeter means separations
loop through the strs list
for each string in strs
    grab the length add #
use string builder

decode:
while i  < length of str
get the length = i
i++ move to #
while (j < length)
    string build char at j
    j++
i= j


***/
    public String encode(List<String> strs) {
        StringBuilder strBuild = new StringBuilder();
        for( String word: strs) {
            strBuild.append(word.length());
            strBuild.append("#");
            strBuild.append(word);
        }

        return strBuild.toString();

    }

    public List<String> decode(String str) {
        ArrayList<String> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < str.length()) {
            StringBuilder numSb = new StringBuilder();
            // move to # can't assume digit is one number! must move until #
            while(str.charAt(i) != '#'){
                numSb.append(str.charAt(i));
                i++;
            }
            String lengthS = numSb.toString();
            int length = Integer.parseInt(lengthS);
            
            j = i + 1;
            int end = j + length;
         StringBuilder sb = new StringBuilder();
            while(j  < end) {
                sb.append(str.charAt(j));
                j++;
            }
            result.add(sb.toString());
            i = j;
        }

        return result;
    }
}
