// brute force

class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        int n=arr.length;
        ArrayList<Integer> span=new ArrayList<>();
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i;j>=0;j--){
                if(arr[j]<=arr[i]){
                    count++;
                }
                else{
                    break;
                }
            }
            span.add(count);
        }
        return span;
    }
}

// optimized code

class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        int n=arr.length;
        ArrayList<Integer> span=new ArrayList<>();
        Stack<Integer> stock=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stock.isEmpty() && arr[stock.peek()]<=arr[i]){
                stock.pop();
            }
            if(stock.isEmpty()){
                span.add(i+1);
            }
            else
            span.add(i-stock.peek());
            stock.push(i);
        }
        return span;
    }
}