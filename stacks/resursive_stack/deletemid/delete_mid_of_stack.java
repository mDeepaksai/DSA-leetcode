class Solution {
    public void deleteMid(Stack<Integer> s) {
        int size = s.size();
        int mid = size / 2 + 1;
        deleteMiddle(s, mid, 1);
    }

    private void deleteMiddle(Stack<Integer> s, int mid, int curr) {
        if (curr == mid) {
            s.pop();
            return;
        }
        int temp = s.pop();
        deleteMiddle(s, mid, curr + 1);
        s.push(temp);
    }
}