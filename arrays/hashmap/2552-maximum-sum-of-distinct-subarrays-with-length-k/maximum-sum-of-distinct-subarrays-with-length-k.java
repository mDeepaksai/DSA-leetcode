/////very good problem//////
/////sliding window + hashmap////
///// as i want to have sum of subarrays with unique element
///// create hashmap map take first window and store that number with there count then add next element again store that number and there count then remove element and count //////

import java.util.HashMap;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        long sum = 0;
        long max = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];

            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        if (map.size() == k) {
            max = sum;
        }

        for (int i = k; i < n; i++) {

            sum += nums[i];

            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }

            sum -= nums[i - k];

            // FIX
            map.put(nums[i - k],
                    map.get(nums[i - k]) - 1);

            if (map.get(nums[i - k]) == 0) {
                map.remove(nums[i - k]);
            }

            if (map.size() == k) {
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}
