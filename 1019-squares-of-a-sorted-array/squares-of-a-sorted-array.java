import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int left=0;
        int right=n-1;
        int k=n-1;
        for(int i=0;i<n;i++){
            int l=nums[left]*nums[left];
            int r=nums[right]*nums[right];
            if(l>r){
                ans[k]=l;
                left++;
            }
            else{
                ans[k]=r;
                right--;
            }
            k--;
        }
        return ans;
    }
}