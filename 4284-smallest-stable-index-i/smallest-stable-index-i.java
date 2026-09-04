class Solution {

    public int firstStableIndex(int[] nums, int k) {

        int n = nums.length;

        int index = 0;

        while (index < n) {

            int max = nums[0];
            int min = nums[index];

            for (int i = 0; i <= index; i++) {
                max = Math.max(nums[i], max);
            }

            for (int i = index; i < n; i++) {
                min = Math.min(nums[i], min);
            }

            if (max - min <= k) {
                return index;
            }

            index++;
        }

        return -1;
    }
}