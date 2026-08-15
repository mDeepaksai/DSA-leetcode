class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        int totalsum = 0;
        
        // Fix 2: Prevent overflow by taking modulo p at each step
        for (int num : nums) {
            totalsum = (totalsum + num) % p;
        }
        
        int rem = totalsum;
        // Fix 3a: If total sum is already divisible by p
        if (rem == 0) return 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        
        int sum = 0;
        int ans = n; // Initialize to maximum possible length
        
        for (int i = 0; i < n; i++) {
            sum = (sum + nums[i]) % p;
            int target = (sum - rem + p) % p;
            
            if (map.containsKey(target)) {
                // Fix 1: Use Math.min instead of Math.max
                ans = Math.min(ans, i - map.get(target));
            }
            map.put(sum, i);
        }
        
        // Fix 3b: Cannot remove the whole array
        return ans == n ? -1 : ans;
    }
}