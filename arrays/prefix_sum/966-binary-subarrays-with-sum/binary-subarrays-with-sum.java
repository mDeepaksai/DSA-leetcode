////optimal way/////
///// using prefixsum + hashmap/////
/////map.put(0,1) because asked about freq/////

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       HashMap<Integer,Integer> map=new HashMap<>();
       map.put(0,1);
       int prefixsum=0;
       int count=0;
       for(int i=0;i<nums.length;i++){
        prefixsum+=nums[i];
        if(map.containsKey(prefixsum-goal)){
            count+=map.get(prefixsum-goal);
        }
        map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
       } 
       return count;
    }
}
