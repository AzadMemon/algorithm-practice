public class LinkedListNode<T> {
    public T data;
    public LinkedListNode<T> next = null;
    public LinkedListNode<T> prev = null;

    public void addAll(T[] elements) {
        this.data = elements[0];

        LinkedListNode<T> head = this;
        for (int i = 1; i < elements.length; i++) {
            head.next = new LinkedListNode<>();
            head.next.data = elements[i];
            head = head.next;
        }
    }
}