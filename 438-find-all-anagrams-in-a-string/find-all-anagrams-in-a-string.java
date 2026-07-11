class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> res=new ArrayList<>();
        HashMap<Character,Integer> pmap=new HashMap<>();
        HashMap<Character,Integer> smap=new HashMap<>();
        for(char c:p.toCharArray()){
            pmap.put(c,pmap.getOrDefault(c,0)+1);
        }
        int left=0, count=p.length();
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            smap.put(ch,smap.getOrDefault(ch,0)+1);
            if(pmap.containsKey(ch) && smap.get(ch)<=pmap.get(ch)){
                count--;
            }
            if(right -left+1>p.length()){
                char leftchar=s.charAt(left);
                if(pmap.containsKey(leftchar) && smap.get(leftchar)<=pmap.get(leftchar)){
                    count++;
                }
                smap.put(leftchar,smap.get(leftchar)-1);
                left++;
            }
            if(count==0){
                res.add(left);
            }
        }
        return res;
    }
}