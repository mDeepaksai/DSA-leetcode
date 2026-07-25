class Solution {
    public int maxProduct(int n) {
        String ch = String.valueOf(n);
        int max1 = 0;
        int max2 = 0;

        for (int i = 0; i < ch.length(); i++) {
            int digit = ch.charAt(i) - '0';
            
            if (digit > max1) {
                max2 = max1;
                max1 = digit;
            } else if (digit > max2) {
                max2 = digit;
            }
        }

        return max1 * max2;
    }
}