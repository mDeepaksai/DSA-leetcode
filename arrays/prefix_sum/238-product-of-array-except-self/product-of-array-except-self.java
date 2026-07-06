/////brute force////


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            int prod=1;
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                prod*=nums[j];
            }
            res[i]=prod;
        }
        return res;
    }
}

////optimal way/////



class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        res[0]=1;
        for(int i=1;i<n;i++){
            res[i]=res[i-1]*nums[i-1];
        }
        int rightprod=1;
        for(int j=n-1;j>=0;j--){
            res[j]=res[j]*rightprod;
            rightprod*=nums[j];
        }
        return res;
    }
}
