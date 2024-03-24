class MyStack {
    private char[] array;
    private int top;
    private int maxSize;

    public MyStack(int size) {
        maxSize = size;
        array = new char[maxSize];
        top = -1;
    }

    public void push(char c) {
        array[++top] = c;
    }

    public char pop() {
        return array[top--];
    }

    public char peek() {
        return array[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
