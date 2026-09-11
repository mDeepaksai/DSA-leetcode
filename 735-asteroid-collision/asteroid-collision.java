class Solution {
    public int[] asteroidCollision(int[] asteroids) {
       Stack<Integer>s=new Stack<>();
       for(int a:asteroids){
        while(!s.isEmpty() && a<0 && s.peek()>0 && s.peek()<-a){
            s.pop();
        }
        if(!s.isEmpty() && a<0 && s.peek()>0){
            if(s.peek()==-a){
                s.pop();
            }
        }
        else{
            s.push(a);
        }
       }
       int[] ans=new int[s.size()];
       for(int i=s.size()-1;i>=0;i--){
        ans[i]=s.pop();
       }
       return ans;
    }
}