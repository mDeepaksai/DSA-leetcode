/////brute/////

class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0;
        for(int l=0;l<nums.length;l++){
            int count=0;
            for(int r=l;r<nums.length;r++){
                if(nums[r]==0){
                    count++;
                }
                if(count>k){
                    break;
                }
                max=Math.max(max,r-l+1);
            }
        }
        return max;
    }
}

////optimized/////

class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0;
        int count=0;
        int l=0;
            for(int r=0;r<nums.length;r++){
                if(nums[r]==0){
                    count++;
                }
                while(count>k){
                    if(nums[l]==0){
                        count--;
                    }
                    l++;
                }
                max=Math.max(max,r-l+1);
        }
        return max;
    }
}
