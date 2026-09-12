class Solution {
    public boolean backspaceCompare(String s, String t) {
        return built(s).equals(built(t));
    }
    private String built(String str){
        Stack<Character>s=new Stack<>();
        for(char c:str.toCharArray()){
            if(c=='#'){
                if(!s.isEmpty()){
                    s.pop();
                }
            }
                else{
                    s.push(c);
                }
        }
        StringBuilder result=new StringBuilder();
        for(char c:s)
        {
            result.append(c);
        }
        return result.toString();
    }
}