// O(N)

class Solution {

    public int fibonacci(int a, int b, int n) {

        if (n == 0) {
            return a;
        }

        return fibonacci(b, a + b, n - 1);
    }

    public int fib(int n) {

        return fibonacci(0, 1, n);
    }
}

// O(2**N)

class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
