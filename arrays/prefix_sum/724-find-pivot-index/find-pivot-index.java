/////brute force////


class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int leftsum=0;
            for(int j=0;j<i;j++){
                leftsum+=nums[j];
            }
            int rightsum=0;
            for(int j=i+1;j<n;j++){
                rightsum+=nums[j];
            }
            if(rightsum==leftsum){
                return i;
            }
        }
        return -1;
    }
}

/////optimized way/////


class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int totalsum=0;
        for(int num:nums){
            totalsum+=num;
        }
        int leftsum=0;
        for(int i=0;i<n;i++){
            int rightsum=totalsum-leftsum-nums[i];
            if(leftsum==rightsum){
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
}
