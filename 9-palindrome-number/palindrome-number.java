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