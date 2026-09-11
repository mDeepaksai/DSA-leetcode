// brute force

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
       List<Integer>list=new ArrayList<>();
       for(int x:asteroids){
        list.add(x);
       } 
       int i=0;
       while(i<list.size()-1){
        int a=list.get(i);
        int b=list.get(i+1);
        if(a>0 && b<0){
            if(Math.abs(a)>Math.abs(b)){
                list.remove(i+1);
            }
            else if(Math.abs(a)<Math.abs(b)){
                list.remove(i);
                if(i>0)
                i-=1;
            }
            else{
                list.remove(i+1);
                list.remove(i);
                if(i>0)
                i-=1;
            }
        }
        else{
            i++;
        }
       }
       int[] ans=new int[list.size()];
       for(i=0;i<list.size();i++){
        ans[i]=list.get(i);
       }
       return ans;
    }
}

// optimized code

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
