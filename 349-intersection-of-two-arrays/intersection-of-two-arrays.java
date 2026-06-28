class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> common=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    if(!common.contains(nums1[i])){
                        common.add(nums1[i]);
                    }
                break;
                }
            }
        }
        int[] result=new int[common.size()];
        for(int i=0;i<common.size();i++){
            result[i]=common.get(i);
        }
        return result;
    }
}