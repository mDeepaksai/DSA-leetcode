class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String t : tokens) {
            if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) {
                int a = st.pop(); // right operand
                int b = st.pop(); // left operand
                
                if (t.equals("+")) st.push(b + a);
                else if (t.equals("-")) st.push(b - a);
                else if (t.equals("*")) st.push(b * a);
                else if (t.equals("/")) st.push(b / a);
            } else {
                st.push(Integer.parseInt(t));
            }
        }
        return st.peek();
    }
}