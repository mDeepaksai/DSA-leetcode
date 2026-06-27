class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        int l=0;
        Arrays.sort(nums);
        for(int r=1;r<n;r++){
            if(nums[l]==nums[r]){
                return true;
            }
            l++;
        }
        return false;
    }
}