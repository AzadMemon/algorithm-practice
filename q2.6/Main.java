import java.util.LinkedList;

public class Main {

    public static boolean checkIfPalindrome(LinkedListNode<Integer> potentialPalindrome) {
        if (potentialPalindrome == null || potentialPalindrome.data == null) {
            return false;
        }

        LinkedListNode<Integer> reverse = new LinkedListNode<Integer>();

        int length = 1;

        // Reverse
        LinkedListNode<Integer> head = potentialPalindrome;
        reverse.data = head.data;
        while (head.next != null) {
            head = head.next;
            LinkedListNode node = new LinkedListNode<Integer>();
            node.data = head.data;
            node.next = reverse;

            reverse = node;
            length++;
        }

        int index = 0;
        while (index < Math.ceil(length / 2)) {
            if (!reverse.data.equals(potentialPalindrome.data)) {
                return false;
            }

            reverse = reverse.next;
            potentialPalindrome = potentialPalindrome.next;

            index++;
        }

        return true;
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> test1 = new LinkedListNode<Integer>();
        test1.addAll(new Integer[]{1, 1, 0, 1, 1});
        System.out.println(checkIfPalindrome(test1));

        LinkedListNode<Integer> test2 = new LinkedListNode<Integer>();
        test2.addAll(new Integer[]{1, 1, 0, 1, 0});
        System.out.println(checkIfPalindrome(test2));
    }
}