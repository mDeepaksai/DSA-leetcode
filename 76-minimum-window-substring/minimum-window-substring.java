import java.util.HashMap;

class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        // 1. Build frequency map for target string t
        HashMap<Character, Integer> tmap = new HashMap<>();
        for (char c : t.toCharArray()) {
            tmap.put(c, tmap.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> smap = new HashMap<>();
        int left = 0;
        
        // count represents how many DISTINCT characters in t still need to be fully matched
        int count = tmap.size(); 
        
        int minLen = Integer.MAX_VALUE;
        int minLeft = 0;

        // 2. Expand sliding window with right pointer
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            smap.put(ch, smap.getOrDefault(ch, 0) + 1);

            // If current char fulfills the target frequency requirement for that char
            if (tmap.containsKey(ch) && smap.get(ch).equals(tmap.get(ch))) {
                count--;
            }

            // 3. Shrink window with left pointer when all required characters are present
            while (count == 0) {
                // Update minimum window tracking pointers
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minLeft = left;
                }

                char lch = s.charAt(left);
                smap.put(lch, smap.get(lch) - 1);

                // If removing lch makes smap's count fall strictly below tmap's required count
                if (tmap.containsKey(lch) && smap.get(lch) < tmap.get(lch)) {
                    count++;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLen);
    }
}