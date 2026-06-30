class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        int l=0;int r=n-1;
        while(l<r){
            int h = Math.min(height[l], height[r]);
            int width = r - l;
            int area = h * width;
            max = Math.max(area, max);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}