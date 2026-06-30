class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> arr1 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            arr1.add(nums1[i]);
        }

        HashSet<Integer> result = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if (arr1.contains(nums2[i])) {
                result.add(nums2[i]);
            }
        }

        int[] ans = new int[result.size()];
        int idx = 0;
        for (int num : result) {
            ans[idx++] = num;
        }
        return ans;
    }
}