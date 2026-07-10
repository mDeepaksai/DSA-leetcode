////sliding window////
////first we will count all Consecutive ones if we get one in between of them then reset the count=0, then again start the count of one from 0 then return max count of consecutive ones in array////
////simple problem only////

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int count=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                count=0;
            }
                max=Math.max(count,max);
        }
        return max;
    }
}
