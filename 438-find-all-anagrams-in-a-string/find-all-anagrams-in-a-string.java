import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> res = new ArrayList<>();

        int n = s.length();
        int k = p.length();

        if (n < k)
            return res;

        Map<Character, Integer> pmap = new HashMap<>();
        Map<Character, Integer> smap = new HashMap<>();

        // Frequency of characters in p
        for (char c : p.toCharArray()) {
            pmap.put(c, pmap.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int count = k;

        for (int right = 0; right < n; right++) {

            char ch = s.charAt(right);

            smap.put(ch, smap.getOrDefault(ch, 0) + 1);

            // Character contributes to matching p
            if (pmap.containsKey(ch) &&
                smap.get(ch) <= pmap.get(ch)) {
                count--;
            }

            // Window size becomes greater than k
            if (right - left + 1 > k) {

                char lchar = s.charAt(left);

                if (pmap.containsKey(lchar) &&
                    smap.get(lchar) <= pmap.get(lchar)) {
                    count++;
                }

                smap.put(lchar, smap.get(lchar) - 1);
                left++;
            }

            // All characters matched
            if (count == 0) {
                res.add(left);
            }
        }

        return res;
    }
}