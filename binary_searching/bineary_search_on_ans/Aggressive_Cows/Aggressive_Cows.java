class Solution {
     public int aggressiveCows(int[] arr, int k) {
         Arrays.sort(arr);

         int low = 1;
         int high = arr[arr.length - 1] - arr[0];
         int ans = 0;

         while (low <= high) {
             int mid = low + (high - low) / 2;

             if (canPlaceCows(arr, k, mid)) {
                 ans = mid;
                 low = mid + 1;
             } else {
                 high = mid - 1; 
             }
         }

         return ans;
     }

     private boolean canPlaceCows(int[] arr, int k, int dist) {
         int count = 1; 
         int lastPos = arr[0];

         for (int i = 1; i < arr.length; i++) {
             if (arr[i] - lastPos >= dist) {
                 count++;
                 lastPos = arr[i];
             }
             if (count >= k) {
                 return true;
             }
         }

         return false;
     }
 }