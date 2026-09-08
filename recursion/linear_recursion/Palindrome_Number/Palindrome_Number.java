class Solution {
    public boolean isPalindrome(int n) {
        n=Math.abs(n); //for handling negative numbers 
        String str=Integer.toString(n);
        return checkPal(str,0,str.length()-1);
    }
    private boolean checkPal(String str,int left,int right){
        if(left>=right){
            return true;
        }
        if(str.charAt(left)!=str.charAt(right)){
            return false;
        }
        return checkPal(str,left+1,right-1);
    }
}