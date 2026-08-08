class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        String result="";
        int left=0;
        int right=n-1;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(s,i,j)){
                    if(j-i+1>result.length()){
                        result=s.substring(i,j+1);
                    }
                }
            }
        }
        return result;
    }
    public boolean isPalindrome(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}