//brute force 
//time comp will O(n**2)

class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int left=0,right=n-1;
        int max=0;
       for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            int prod=(nums[i]-1)*(nums[j]-1);
        max=Math.max(prod,max);
        }
       }
        return max;
    }
}

//optimal way
//time comp will O(n)
//we will find largest and sec largest then product of that will be max only na

class Solution {
    public int maxProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        return (max1 - 1) * (max2 - 1);
    }
}
