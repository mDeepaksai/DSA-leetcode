class Solution {
    static int findFloor(int[] arr, int x) {
        int n=arr.length;
        int left=0;
        int right=n-1;
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]<=x){
                left=mid+1;
                ans=mid;
            }
            else{
                right=mid-1;
            }
        }
        return ans;
    }
}
