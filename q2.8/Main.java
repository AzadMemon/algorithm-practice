/* Typically the simplest method involves just adding each node to 

 */
public class Main {
    public static LinkedListNode<Integer> findCollision(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> fastRunner = head;
        LinkedListNode<Integer> slowRunner = head;

        if (fastRunner.next != null) {
            fastRunner = fastRunner.next;
            slowRunner = slowRunner.next;
        } else {
            return null;
        }

        if (fastRunner.next != null) {
            fastRunner = fastRunner.next;
        } else {
            return null;
        }

        while(slowRunner != fastRunner) {
            if (slowRunner.next == null || fastRunner.next == null) {
                return null;
            }

            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next;

            if (fastRunner.next == null) {
                return null;
            }

            fastRunner = fastRunner.next;
        }

        return slowRunner;
    }

    public static void main(String[] args) {
        // Once we have collission spot, we are k behind the start of the loop
        LinkedListNode<Integer> head = new LinkedListNode<Integer>();
        head.addAll(new Integer[]{1,2,3,4,5,6});

        // Get reference to third node
        int index = 0;
        LinkedListNode<Integer> thirdNode = head;
        while (index != 2) {
            index++;
            thirdNode = thirdNode.next;
        }

        // Get tail node
        LinkedListNode<Integer> tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = thirdNode;

        // Print out loop list
//        LinkedListNode<Integer> iterator = head;
//        for (int i =0; i <= 7; i++) {
//            System.out.println(iterator.data);
//            iterator = iterator.next;
//        }

        // Now that we've established a singly linked list with a loop
        LinkedListNode<Integer> collisionSpot = findCollision(head);

        while (head != collisionSpot) {
            collisionSpot = collisionSpot.next;
            head = head.next;
        }

        System.out.println(head.data);
    }
}