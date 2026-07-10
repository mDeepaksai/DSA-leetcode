////brute force/////


class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int product = 1;

            for (int j = i; j < n; j++) {
                product *= nums[j];

                if (product < k) {
                    count++;
                } else {
                    break;
                }
            }
        }

        return count;
    }
}

/////optimizied way//////
////sliding window, simple problem only////
//// in normal amx sum of sliding window there we do add the next element and remove the old element but in product we will divide the the next element nothing else//// 


class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;

        int totalCount = 0;
        int product = 1;
        for (int left = 0, right = 0; right < nums.length; right++) {
            product *= nums[right];
            while (product >= k) {
                product /= nums[left++];
            }
            totalCount += right - left + 1;  
        }

        return totalCount;
    }
}
