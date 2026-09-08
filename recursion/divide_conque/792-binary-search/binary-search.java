class Solution {
    public int binary(int[] nums,int st,int end,int target){
        if (st > end) {
            return -1;
        }
        int mid=st+(end-st)/2;
        if (nums[mid] == target) {
            return mid;
        }
        if (target < nums[mid]) {
            return binary(nums, st, mid - 1, target);
        }
        return binary(nums, mid + 1, end, target);
    }
    public int search(int[] nums, int target) {
        int n=nums.length;
        int st=0;
        int end=n-1;
        return binary(nums,st,end,target);
    }
}