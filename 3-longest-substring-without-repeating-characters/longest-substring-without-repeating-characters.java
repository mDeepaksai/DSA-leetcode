class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();
        int maxlen=0;
        int left=0;

        for(int right=0;right<n;right++){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>1){
                char leftchar=s.charAt(left);
                map.put(leftchar,map.get(leftchar)-1);
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}