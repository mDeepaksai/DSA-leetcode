class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int max = 0;
        int sum = 0;

        for (int w : weights) {
            max = Math.max(max, w);
            sum += w;
        }
        int ans=0;
        while(max<=sum){
            int cap=max+(sum-max)/2;
            if(canShip(weights,days,cap)){
                ans=cap;
                sum=cap-1;
            }
            else{
                max=cap+1;
            }
        }
        return ans;
    }

    private boolean canShip(int[] weights, int days, int cap) {

        int d = 1;
        int curr = 0;

        for (int w : weights) {

            if (curr + w > cap) {
                d++;
                curr = w;
            } else {
                curr += w;
            }
        }

        return d <= days;
    }
}