class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int total=0;
        int left=0,right=n-1;
        int leftmost=height[left],rightmost=height[right];
        while(left<right){
            if(leftmost<rightmost){
                left++;
                leftmost=Math.max(leftmost,height[left]);
                total+=leftmost-height[left];
            }
            else{
                right--;
                rightmost=Math.max(rightmost,height[right]);
                total+=rightmost-height[right];
            }
        }
        return total;
    }
}