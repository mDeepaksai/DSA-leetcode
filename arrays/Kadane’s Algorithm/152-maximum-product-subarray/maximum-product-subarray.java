////brute force///


class Solution {
    public int maxProduct(int[] nums) {
     int maxans=nums[0];
     int n=nums.length;
     for(int i=0;i<n;i++){
        int prod=1;
        for(int j=i;j<n;j++){
            prod*=nums[j];
            maxans=Math.max(prod,maxans);
        }
     }   
     return maxans;
    }
}



////optimized way////

class Solution {
    public int maxProduct(int[] nums) {
     int n=nums.length;
     int ans=nums[0];
     int max=nums[0];
     int min=nums[0];
     for(int i=1;i<n;i++){
        if(nums[i]<0){
            int temp=max;
            max=min;
            min=temp;
        }
        max=Math.max(nums[i],nums[i]*max);
        min=Math.min(nums[i],nums[i]*min);
        ans=Math.max(ans,max);
     }   
     return ans;
    }
}
