public class sum {
    public static void printSum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        // System.out.println(n);
        sum+=i;
        printSum(i+1,n,sum);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int n=5;
        printSum(1,n,0);
    }
}