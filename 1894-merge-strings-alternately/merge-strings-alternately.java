class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged=new StringBuilder();
        int i=0;
        int n=word1.length();
        int m=word2.length();
        while(i<n || i<m){
            if(i<n){
                merged.append(word1.charAt(i));
            }
            if(i<m){
                merged.append(word2.charAt(i));
            }
            i++;
        }
        return merged.toString();
    }
}