////brute force///


class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        int len=0;
        for(int i=0;i<n;i++){
        int count0=0;
        int count1=0;
            for(int j=i;j<n;j++){
                if(nums[j]==1){
                    count0++;
                }
                if(nums[j]==0){
                    count1++;
                }
                if(count0==count1){
                    len=Math.max(len,j-i+1);
                }
            }
        }
        return len;
    }
}

////optimal way////

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
