// brute force

class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n=arr.length;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            int greater=-1;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    greater=arr[j];
                    break;
                }
            }
            ans.add(greater);
        }
        return ans;
    }
}

// optimized code

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int n = nums2.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        Stack<Integer> s = new Stack<>();

        for(int i = n - 1; i >= 0; i--){

            while(!s.isEmpty() && s.peek() <= nums2[i]){
                s.pop();
            }

            if(!s.isEmpty()){
                map.put(nums2[i], s.peek());
            }
            else{
                map.put(nums2[i], -1);
            }

            s.push(nums2[i]);
        }

        int[] ans = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++){
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}