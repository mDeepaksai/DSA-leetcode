////very good question////
////brute force////


class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int count=0;
        for(int i=0;i<s.length();i++){
            count+=expand(s,i,i);
            count+=expand(s,i,i+1);
            }
            return count;
    }

    public int expand(String s, int left, int right) {
        int count=0;
        while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }
}

////optimal way////


class Solution {
    public int countSubstrings(String s) {
       int n=s.length();
       int count=0;
       for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            if(ispalindromal(s,i,j)){
                count++;
            }
        }
       } 
       return count;
    }
    private boolean ispalindromal(String s,int left,int right){
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
