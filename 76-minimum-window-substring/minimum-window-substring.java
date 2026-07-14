////brute force////


class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> tmap=new HashMap<>();
        for(char c: t.toCharArray()){
            tmap.put(c,tmap.getOrDefault(c,0)+1);
        }
        String ans="";
        for(int i=0;i<s.length();i++){
            Map<Character,Integer> smap=new HashMap<>();
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                smap.put(ch,smap.getOrDefault(ch,0)+1);
                if(isvalid(smap,tmap)){
                    String sub=s.substring(i,j+1);
                    if(ans.equals("") || sub.length() < ans.length()){
                        ans=sub;
                    }
                }
            }
        }
        return ans;
    }
    public boolean isvalid(Map<Character,Integer> smap,Map<Character,Integer> tmap){
        for(char c:tmap.keySet()){
            if(smap.getOrDefault(c,0)<tmap.get(c)){
                return false;
            }
        }
        return true;
    }
}


////using hashmap + sliding////



class Solution {
    public String minWindow(String s, String t) {

        Map<Character, Integer> tmap = new HashMap<>();

        for (char c : t.toCharArray()) {
            tmap.put(c, tmap.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> smap = new HashMap<>();

        int left = 0;
        int count = t.length();

        int minlen = Integer.MAX_VALUE;
        String ans = "";

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            smap.put(ch, smap.getOrDefault(ch, 0) + 1);

            if (tmap.containsKey(ch) && smap.get(ch) <= tmap.get(ch)) {
                count--;
            }

            while (count == 0) {

                if (right - left + 1 < minlen) {
                    minlen = right - left + 1;
                    ans = s.substring(left, right + 1);
                }

                char leftchar = s.charAt(left);

                smap.put(leftchar, smap.get(leftchar) - 1);

                if (tmap.containsKey(leftchar) &&
                    smap.get(leftchar) < tmap.get(leftchar)) {
                    count++;
                }

                left++;
            }
        }

        return ans;
    }
}
