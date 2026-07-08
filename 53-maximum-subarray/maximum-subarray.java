///brute force////


class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}

////optimal way/////
////using kadane's algorthim////

class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int maxsum=nums[0];
        int cursum=0;
        for(int i=0;i<n;i++){
            cursum+=nums[i];
            maxsum=Math.max(maxsum,cursum);
            if(cursum<0){
                cursum=0;
            }
        }
        return maxsum;
    }
}
