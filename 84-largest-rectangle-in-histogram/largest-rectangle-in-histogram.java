class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int max=0;
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<=n;i++){
            int h=(i==n) ? 0:heights[i];
            while(!s.isEmpty() && heights[s.peek()]>h){
                int height=heights[s.pop()];
                int w=s.isEmpty() ? i:i-s.peek()-1;
                int area=height*w;
                max=Math.max(max,area);
            }
            s.push(i);
        }
        return max;
    }
}