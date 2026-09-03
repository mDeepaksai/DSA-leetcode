public class power {
    public static int calPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int a=calPower(x, n-1);
        return x*a;
    }
    public static void main(String[] args) {
        int x=2,n=3;
        System.out.println(calPower(x, n));
    }
}