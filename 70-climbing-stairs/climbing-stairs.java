class Solution {

    public int climbStairs(int n) {
        return climbCheck(1, 1, n);
    }

    private int climbCheck(int a, int b, int n) {

        if (n == 0) {
            return a;
        }

        return climbCheck(b, a + b, n - 1);
    }
}