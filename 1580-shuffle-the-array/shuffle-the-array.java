class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res=new int[nums.length];
        int left=0;
        int right=n;
        int i=0;
        while(i<nums.length){
            if(i%2!=0){
                res[i]=nums[right];
                right++;
            }
            else{
                res[i]=nums[left];
                left++;
            }
            i++;
        }
        return res;
    }
}