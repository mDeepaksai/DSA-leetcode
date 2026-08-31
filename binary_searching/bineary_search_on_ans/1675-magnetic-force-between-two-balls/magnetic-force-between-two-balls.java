import java.util.Arrays;

class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        
        int low = 1;
        int high = position[position.length - 1] - position[0];
        int ans = 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (valid(mid, position, m)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private boolean valid(int gap, int[] position, int m) {
        int last = position[0];
        int count = 1;
        
        for (int i = 1; i < position.length; i++) {
            if (position[i] - last >= gap) {
                count++;
                last = position[i];
            }
        }
        
        return count >= m;
    }
}