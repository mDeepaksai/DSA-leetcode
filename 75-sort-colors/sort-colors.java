////optimized way/////

class Solution {
    public void sortColors(int[] nums) {
        int zero=0;
        int ones=0;
        int two=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
            else if(nums[i]==1){
                ones++;
            }
            else{
                two++;
            }
        }
        int i=0;
        while(zero>0){
            nums[i]=0;
            i++;
            zero--;
        }
        while(ones>0){
            nums[i]=1;
            i++;
            ones--;
        }
        while(two>0){
            nums[i]=2;
            i++;
            two--;
        }
    }
}

/////another way ////
////using two pointers////

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low=0;
        int high=n-1;
        int mid=0;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }
}
