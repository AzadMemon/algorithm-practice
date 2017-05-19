public class Stack<T> {
    class StackElement<T> {
        public T data;
        public StackElement<T> next;

        public StackElement(T data) {
            this.data = data;
        }
    }

    public StackElement<T> top;

    public T pop() {
        StackElement<T> oldTop = top;
        top = top.next;
        return oldTop.data;
    }

    public void push(T data) {
        StackElement<T> element = new StackElement<T>(data);
        element.next = top;
        top = element;
    }
}