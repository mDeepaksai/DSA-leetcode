////optimized/////
////this sliding window //////

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int sum=0;
        int left=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                int len=i-left+1;
                ans=Math.min(ans,len);
                sum-=nums[left];
                left++;
            }
        }
        if(ans==Integer.MAX_VALUE){
            return 0;
        }
        return ans;
    }
}

/////brute force/////

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum >= target) {
                    ans = Math.min(ans, j - i + 1);
                    break;
                }
            }
        }

        if (ans == Integer.MAX_VALUE) {
            return 0;
        }
        return ans;
    }
}
