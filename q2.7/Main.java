import java.util.HashSet;
import java.util.Set;

public class Main {

    public static boolean checkIfIntersect(LinkedListNode<Integer> l1, LinkedListNode<Integer> l2) {
        Set<LinkedListNode<Integer>> setOfNodes = new HashSet<LinkedListNode<Integer>>();

        LinkedListNode<Integer> iterator = l1;
        while (iterator.next != null) {
            setOfNodes.add(iterator);
            iterator = iterator.next;
        }

        iterator = l2;
        while (iterator.next != null) {
            if (setOfNodes.contains(iterator)) {
                return true;
            }
            iterator = iterator.next;
        }

        return false;
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> l1 = new LinkedListNode<Integer>();
        l1.addAll(new Integer[]{1,2,3,4,5});

        LinkedListNode<Integer> l2 = new LinkedListNode<Integer>();
        l2.addAll(new Integer[]{1, 2});

        // Get third element in l1
        int index = 0;
        LinkedListNode<Integer> element = l1;
        while(index != 2) {
            index++;
            element = element.next;
        }

        // Add element
        LinkedListNode<Integer> tail = l2;
        while(tail.next != null) {
            tail = tail.next;
        }
        tail.next = element;


        System.out.println(checkIfIntersect(l1, l2));
    }
}