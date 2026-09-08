// O(N)
// it is similar to fibonacci but it starts from 1 not 0 that's all 

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

// O(2**N)

class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }
}
