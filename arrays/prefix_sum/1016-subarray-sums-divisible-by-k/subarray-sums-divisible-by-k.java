/////brute force/////


class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int res=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int mod = (sum % k + k) % k;
            if(map.containsKey(mod)){
                res+=map.get(mod);
            }
            map.put(mod,map.getOrDefault(mod,0)+1);
        }
        return res;
    }
}


//////optimal way////

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int res=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int mod = (sum % k + k) % k;
            if(map.containsKey(mod)){
                res+=map.get(mod);
            }
            map.put(mod,map.getOrDefault(mod,0)+1);
        }
        return res;
    }
}
