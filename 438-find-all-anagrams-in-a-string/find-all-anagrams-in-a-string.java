////very good and new type of problem////
////brute force////


class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> res=new ArrayList<>();
        int n=s.length();
        int k=p.length();
        int[] pcount=new int[26];
        for(char c:p.toCharArray()){
            pcount[c-'a']++;
        }   
        for(int i=0;i<=n-k;i++){
            int[] scount =new int[26];
            for(int j=i;j<i+k;j++){
                scount[s.charAt(j)-'a']++;
            }
            if(Arrays.equals(pcount,scount)){
                res.add(i);
            }
        }
        return res;
    }
}


////optimal way////


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
