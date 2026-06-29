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