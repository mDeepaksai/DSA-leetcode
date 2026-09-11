class Solution {
    // Helper function to insert an element at the bottom of the stack
    public static void bottomAtStack(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }
        int top = st.pop();
        bottomAtStack(st, x);
        st.push(top);
    }

    // Main function to reverse the stack
    public static void reverseStack(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }
        int top = st.pop();
        reverseStack(st);           // Pass the stack 'st', not 'top'
        bottomAtStack(st, top);     // Works now because bottomAtStack is static
    }
}