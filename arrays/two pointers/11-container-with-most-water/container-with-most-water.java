////brute force/////
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                int h = Math.min(height[i], height[j]);
                int width = j - i;

                int area = h * width;

                max = Math.max(area, max);
            }
        }

        return max;
    }
}


////optimized way////
////using two pointer////


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
