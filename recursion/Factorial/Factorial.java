class Solution {
    int factorial(int n) {
        if(n==1 || n==0){
            return 1;
        }
        int a=factorial(n-1);
        int b=n*a;
        return b;
    }
}
