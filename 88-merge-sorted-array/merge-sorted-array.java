//brute force//

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merge=new int[m+n];
        for(int i=0;i<m;i++){
            merge[i]+=nums1[i];
        }
        for(int i=0;i<n;i++){
            merge[m+i]+=nums2[i];
        }
        Arrays.sort(merge);
        for(int i=0;i<merge.length;i++){
            nums1[i]=merge[i];
        }
    }
}

///////optimized code/////////


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merge=new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                merge[k++]=nums1[i++];
            }
            else{
                merge[k++]=nums2[j++];
            }
        }
        while(i<m){
            merge[k++]=nums1[i++];
        }
        while(j<n){
            merge[k++]=nums2[j++];
        }
        for(int a=0;a<n+m;a++){
            nums1[a]=merge[a];
        }
    }
}
