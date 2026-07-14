import java.util.HashMap;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // Handle edge case where s1 is longer than s2
        if (s1.length() > s2.length()) return false;

        HashMap<Character, Integer> s1map = new HashMap<>(); // targeting s1
        HashMap<Character, Integer> s2map = new HashMap<>(); // sliding window over s2

        for (char c : s1.toCharArray()) {
            s1map.put(c, s1map.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int count = s1.length(); 

        for (int right = 0; right < s2.length(); right++) {
            char ch = s2.charAt(right);
            s2map.put(ch, s2map.getOrDefault(ch, 0) + 1);

            // If the character matches our target criteria, decrement count
            if (s1map.containsKey(ch) && s2map.get(ch) <= s1map.get(ch)) {
                count--;
            }

            // If the window size exceeds s1's length, shrink it from the left
            if (right - left + 1 > s1.length()) {
                char leftchar = s2.charAt(left);
                
                if (s1map.containsKey(leftchar) && s2map.get(leftchar) <= s1map.get(leftchar)) {
                    count++;
                }
                s2map.put(leftchar, s2map.get(leftchar) - 1);
                left++;
            }

            // If all characters match up perfectly, we found a permutation!
            if (count == 0) {
                return true;
            }
        }

        return false;
    }
}