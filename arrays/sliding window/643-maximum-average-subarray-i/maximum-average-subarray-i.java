/////brute force/////

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= n - k; i++) {
            int sum = 0;

            for (int j = i; j < i + k; j++) {
                sum += nums[j];
            }

            max = Math.max(max, sum);
        }

        return (double) max / k;
    }
}


////optimized code////
///sliding window///

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double avg=0;
        for(int i=0;i<k;i++){
            avg+=nums[i];
        }
        double max=avg;
        for(int i=k;i<n;i++){
            avg+=nums[i];
            avg-=nums[i-k];
            max=Math.max(avg,max);
        }
        return max/k;
    }
}
