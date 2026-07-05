//////brute force/////
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
}

/////optimized way///
/////using prefixsum + hashmap//////


class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int n=nums.length;
        int prefixsum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            prefixsum+=nums[i];
            int target=prefixsum-k;
            if(map.containsKey(target)){
                count+=map.get(target);
            }
            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
        }
        return count;
    }
}
