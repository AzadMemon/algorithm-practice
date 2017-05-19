public class Stack2 {
    class StackElement2 {
        public Integer min = Integer.MAX_VALUE;
        public StackElement2 next;
        public Integer data;

        public StackElement2(Integer data, Integer min) {
            this.data = data;
            this.min = min;
        }
    }

    public Integer min;
    public StackElement2 top;

    public void push(Integer data) {
        if (min == null || data.compareTo(min) < 0) {
            min = data;
        }

        StackElement2 element = new StackElement2(data, min);
        element.next = top;
        top = element;
    }

    public Integer pop() {
        StackElement2 oldTop = top;
        top = top.next;

        if (min == oldTop.data){
            if (top == null) {
                min = null;
            } else {
                min = top.min;
            }
        }

        return oldTop.data;
    }
}