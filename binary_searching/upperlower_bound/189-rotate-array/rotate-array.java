// brute force

class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        for(int i=0;i<k;i++){
            int temp=nums[n-1];
            for(int j=n-2;j>=0;j--){
                nums[j+1]=nums[j];
            }
            nums[0]=temp;
        }
    }
}

// optimal code
// what are we doing here is first creating the temp array then that that index we add that original array element and aftering completing it we will just copy the temp to nums that's all
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            int index=(i+k)%n;
            temp[index]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=temp[i];
        }
    }
}
