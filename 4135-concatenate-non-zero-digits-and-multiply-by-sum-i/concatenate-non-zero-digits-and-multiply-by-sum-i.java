import java.util.ArrayList;

class Solution {
    public long sumAndMultiply(int n) {
        String str = String.valueOf(n);
        StringBuilder xStr = new StringBuilder();
        long sum = 0;
        
        // Extract non-zero digits, build x, and calculate sum simultaneously
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != '0') {
                xStr.append(ch);
                sum += (ch - '0'); // Convert char '1'-'9' to int 1-9
            }
        }
        
        // If there are no non-zero digits, x = 0
        if (xStr.length() == 0) {
            return 0;
        }
        
        // Convert the concatenated string to a long to prevent overflow
        long x = Long.parseLong(xStr.toString());
        
        return x * sum;
    }
}