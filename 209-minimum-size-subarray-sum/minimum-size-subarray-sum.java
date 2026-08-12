class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        int sum=0;
        int left=0;
        for(int right=0;right<n;right++){
            sum+=nums[right];
            while(sum>=target){
                int len=right-left+1;
                ans=Math.min(ans,len);
                sum-=nums[left];
                left++;
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}