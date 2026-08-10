import java.util.*;

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int n = s2.length();
        int k = s1.length();

        if (n < k) {
            return false;
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        // Frequency of characters in s1
        for (char ch : s1.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        int left = 0;

        for (int right = 0; right < n; right++) {

            char ch = s2.charAt(right);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);

            // Keep window size equal to s1.length()
            if (right - left + 1 > k) {

                char lch = s2.charAt(left);

                map2.put(lch, map2.get(lch) - 1);

                if (map2.get(lch) == 0) {
                    map2.remove(lch);
                }

                left++;
            }

            // Check whether current window is an anagram of s1
            if (right - left + 1 == k && map1.equals(map2)) {
                return true;
            }
        }

        return false;
    }
}