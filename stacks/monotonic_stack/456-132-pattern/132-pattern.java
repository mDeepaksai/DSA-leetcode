class Solution {
    public boolean find132pattern(int[] nums) {
        int n=nums.length;
        Stack<Integer>s=new Stack<>();
        int two=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(nums[i]<two){
                return true;
            }
            while(!s.isEmpty() && nums[i]>s.peek()){
                two=s.pop();
            }
            s.push(nums[i]);
        }
        return false;
    }
}