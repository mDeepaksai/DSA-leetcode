////brute force////

class Solution {
    public boolean isPalindrome(int x) {

        String str = Integer.toString(x);
        String pal = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            pal += str.charAt(i);
        }

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < pal.length(); j++) {
                if (str.charAt(i) != pal.charAt(j)) {
                    return false;
                }
                break;
            }
        }

        return true;
    }
}

/////optiimized way/////
////two pointers////

class Solution {
    public boolean isPalindrome(int x) {

        String str = Integer.toString(x);
        int n=str.length();
        int left =0;
        int right=n-1;
        while(left<right){
            if(str.charAt(left)==str.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
