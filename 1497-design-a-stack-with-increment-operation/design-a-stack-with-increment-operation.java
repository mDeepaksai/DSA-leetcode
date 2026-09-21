class CustomStack {
    private int[] stack;
    private int maxSize;
    private int index;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[maxSize];
        this.index = -1;
    }
    
    public void push(int x) {
        if (index == maxSize - 1) {
            return;
        } else {
            index++;
            stack[index] = x;
        }
    }
    
    public int pop() {
        if (index == -1) {
            return -1;
        }
        int val = stack[index];
        index--;
        return val;
    }
    
    public void increment(int k, int val) {
        int limit = Math.min(k, index + 1);
        for (int i = 0; i < limit; i++) {
            stack[i] += val;
        }
    }
}