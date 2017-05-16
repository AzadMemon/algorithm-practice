import java.util.LinkedList;

public class Main {

    public static LinkedList<Integer> addTwoLists(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> result = new LinkedList<Integer>();

        int carry = 0;

        while (!l1.isEmpty() || !l2.isEmpty() || carry != 0) {
            int value = carry;

            if (!l1.isEmpty()) {
                value += l1.pop();
            }

            if (!l2.isEmpty()) {
                value += l2.pop();
            }

            result.add(value%10);
            carry = value >= 10 ? 1 : 0;
        }

        return result;
    }

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        l1.add(7);
        l1.add(1);
        l1.add(6);
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        l2.add(5);
        l2.add(9);
        l2.add(2);

        LinkedList<Integer> sum = addTwoLists(l1, l2);

        for(Integer digit : sum) {
            System.out.println(digit);
        }
     }
}