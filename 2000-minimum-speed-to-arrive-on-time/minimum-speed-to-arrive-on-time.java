// brute force


class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int n=dist.length;
        int low=1;
        int high=10000000;
        for(int speed=low;speed<=high;speed++){
            double time=0.0;
            for(int i=0;i<n;i++){
                double t=(double) dist[i]/speed;
                if(i!=n-1){
                    time+=Math.ceil(t);
                }
                else{
                    time+=t;
                }
            }
            if(time<=hour){
                return speed;
            }
        }
        return -1;
    }
}

// optimal code


class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int low = 1;
        int high = 10000000;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canReach(dist, hour, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private boolean canReach(int[] dist, double hour, int speed) {
        int n = dist.length;
        double time = 0.0;
        for (int i = 0; i < n; i++) {
            double t = (double) dist[i] / speed;
            if (i != n - 1) {
                time += Math.ceil(t);
            } else {
                time += t;
            }
        }
        return time <= hour;
    }
}
