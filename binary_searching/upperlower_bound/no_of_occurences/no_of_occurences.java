// here we are using that same logic as first and last position but after that we are finding the length so here why can't we use hashmap or count varible because that is linear search but in problem they have given array is sorted so we will go with binary search and then time comp will O(logn)

class Solution {
    int countFreq(int[] arr, int target) {
        int first=findFirst(arr,target);
        if (first == -1) return 0;
        int last=findLast(arr,target);
        return last-first+1;
    }
    int findFirst(int[] arr,int target){
        int n=arr.length;
        int left=0,right=n-1;
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                ans=mid;
                right=mid-1;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return ans;
    }
    int findLast(int[] arr,int target){
        int n=arr.length;
        int left=0,right=n-1;
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                ans=mid;
                left=mid+1;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return ans;
    }
}
