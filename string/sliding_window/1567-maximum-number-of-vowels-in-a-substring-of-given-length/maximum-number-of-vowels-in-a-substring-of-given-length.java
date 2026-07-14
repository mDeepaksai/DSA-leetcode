////simple sliding window////

class Solution {
    public int maxVowels(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        int max = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (isvowel(s.charAt(i))) {
                count++;
            }
            if (i >= k && isvowel(s.charAt(i - k))) {
                count--;
            }
            max = Math.max(max, count);
        }
        return max;
    }

    public boolean isvowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}

////with hashmap and sliding window////


class Solution {
    public int maxVowels(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        int max = 0;
        int count = 0; 
        int left = 0;
        
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                count++;
            }
            
            if (i - left + 1 > k) {
                char cleft = s.charAt(left);
                if (map.containsKey(cleft)) {
                    map.put(cleft, map.get(cleft) - 1);
                    if (map.get(cleft) == 0) {
                        map.remove(cleft);
                    }
                    count--;
                }
                left++;
            }
            
            max = Math.max(max, count);
        }
        
        return max;
    }
}
