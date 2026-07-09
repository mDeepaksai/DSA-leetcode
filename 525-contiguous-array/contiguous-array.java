class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int prefixsum=0;
        int len=0;
        for(int i=0;i<nums.length;i++){
            prefixsum+= (nums[i]==0)?-1:1;
            if(map.containsKey(prefixsum)){
                len=Math.max(len,i-map.get(prefixsum));
            }
            else{
                map.put(prefixsum,i);
            }
        }
        return len;
    }
}