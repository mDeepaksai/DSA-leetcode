////optimal way///
////using binary search////
//// why we used binary search - because that num which we need to find sqrt we will represent it in number line and sqrt of that number is alway less x/2 of that number 
//// if the sqrt is greater that x then end=mid-1 and if sqrt is lesser than x then start = mid+1
//// and sqrt should be in long while u convert it into int simple

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
