public class Stack<T> {
    private class StackElement<T> {
        public T data;
        public StackElement<T> next;

        public StackElement(T data) {
            this.data = data;
        }
    }

    private T top;

    public StackElement<T> pop() {
        StackElement<T> oldTop = top;
        top = top.next;
        return oldTop;
    }

    public void push(T data) {
        StackElement<T> element = new StackElement<T>(data);
        element.next = top;
        top = element;
    }
}