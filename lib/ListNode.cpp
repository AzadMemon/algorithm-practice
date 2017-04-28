class ListNode {
  public:
    ListNode next;
    ListNode prev;
    int value;

    Node(int val, ListNode nextn, ListNode prevn) {
      value = val;
      next = nextn;
      prev = prevn;
    }
};

int main() {
  return 0;
}
