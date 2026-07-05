//////brute force/////


class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int totalwater = 0;
        
        for (int i = 0; i < n; i++) {
            int leftmax = 0;
            int rightmax = 0;
            
            
            for (int j = 0; j <= i; j++) {
                leftmax = Math.max(leftmax, height[j]);
            }
            
         
            for (int j = i; j < n; j++) {
                rightmax = Math.max(rightmax, height[j]); 
            }
            
            totalwater += Math.min(leftmax, rightmax) - height[i];
        }
        return totalwater;
    }
}

//////optimized code/////


class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left=0;
        int right=n-1;
        int water=0;
        int leftmax=height[left];
        int rightmax=height[right];
        while(left<right){
            if(leftmax<rightmax){
                left++;
                leftmax=Math.max(leftmax,height[left]);
                water+=leftmax-height[left];
            }
            else{
                right--;
                rightmax=Math.max(rightmax,height[right]);
                water+=rightmax-height[right];
            }
        }
        return water;
    }
}
