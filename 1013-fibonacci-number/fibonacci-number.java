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