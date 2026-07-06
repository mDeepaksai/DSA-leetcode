////brute force////

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum%k==0 && j-i+1>=2){
                    return true;
                }
            }
        }
        return false;
    }
}


///optimal way////
/////using hashmap + prefixsum//////


class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum%k)){
                int index=map.get(sum%k);
                if(i-index>=2){
                    return true;
                }
            }
            else{
                map.put(sum%k,i);
            }
        }
        return false;
    }
}
