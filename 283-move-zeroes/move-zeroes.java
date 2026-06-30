class Solution {
    public void moveZeroes(int[] nums) {
         int n=nums.length;
         int[] arr=new int[n];
         int ind=0;
         for(int i=0;i<n;i++){
            if(nums[i]!=0){
                arr[ind]+=nums[i];
                ind++;
            }
         }
         for(int i=0;i<n;i++){
            nums[i]=arr[i];
         }
    }
}