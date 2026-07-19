class Solution {
    public int mySqrt(int x) {
        if(x<2) return x;
        long start=1,end=x/2;
        while(start<=end){
            long mid=start+(end-start)/2;
            long sq=mid*mid;
            if(sq==x) return (int) mid;
            else if(sq>x) end = mid - 1;
            else start = mid + 1;
        }
        return (int) end;
    }
}