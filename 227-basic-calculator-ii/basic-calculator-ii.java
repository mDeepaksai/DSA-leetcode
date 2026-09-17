class Solution {
    public int calculate(String s) {
        if (s == null || s.length() == 0) return 0;
        
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char op = '+';
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }
            
            if ((!Character.isDigit(ch) && ch != ' ') || i == n - 1) {
                if (op == '+') {
                    stack.push(num);
                } else if (op == '-') {
                    stack.push(-num);
                } else if (op == '*') {
                    stack.push(stack.pop() * num);
                } else if (op == '/') {
                    stack.push(stack.pop() / num);
                }
                
                op = ch;
                num = 0;
            }
        }
        
        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        
        return result;
    }
}