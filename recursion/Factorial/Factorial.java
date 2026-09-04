functional

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

parameterized

class Solution {
    private static int  factHelper(int n,int ans){
        if(n==0 || n==1){
            return ans;
        }
        return factHelper(n-1,n*ans);
    }
    int factorial(int n) {
        return factHelper(n,1);
    }
}

