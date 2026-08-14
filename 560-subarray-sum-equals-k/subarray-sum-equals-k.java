class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0,sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int target=sum-k;
            if(map.containsKey(target)){
                count+=map.get(target);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}