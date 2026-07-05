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