class Solution {
    public int findNumbers(int[] nums) {
        // int max=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            String a = String.valueOf(nums[i]);
            int n=a.length();
            if(n%2==0){
                count++;
            }
        }
        return count;
    }
}