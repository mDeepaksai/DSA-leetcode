////brute force/////

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int sum=numbers[i]+numbers[j];
                if(sum==target){
                return new int[]{i+1, j+1};
                }
            }
        }
        return new int[]{-1,-1};

    }
}

/////optimized way//////
/////using two pointers/////

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int left=0;
        int right=n-1;
        while(left<right){
            int sum=numbers[left]+numbers[right];
            if(sum==target){
                return new int[]{left+1,right+1};
            }
            else if(sum>target){
                right--;
            }
            else{
                left++;
            }

        }
        return new int[]{-1,-1};

    }
}
