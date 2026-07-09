//// optimal way ////
////using prefix sum///// 

class Solution {
    public int minSubarray(int[] nums, int p) {
        long totalSum = 0;

        // Calculate total sum
        for (int num : nums) {
            totalSum += num;
        }

        int rem = (int)(totalSum % p);

        // Already divisible
        if (rem == 0) {
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int curr = 0;
        int ans = nums.length;

        for (int i = 0; i < nums.length; i++) {
            curr = (curr + nums[i]) % p;

            int target = (curr - rem + p) % p;

            if (map.containsKey(target)) {
                ans = Math.min(ans, i - map.get(target));
            }

            // Store the latest index
            map.put(curr, i);
        }

        return ans == nums.length ? -1 : ans;
    }
}
