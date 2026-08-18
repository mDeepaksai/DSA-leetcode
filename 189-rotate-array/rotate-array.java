class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            int index=(i+k)%n;
            temp[index]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=temp[i];
        }
    }
}