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