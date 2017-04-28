class Node {
  public:
    Node left;
    Node right;
    int value;

    Node(int val, Node leftn, Node rightn) {
      value = val;
      left = leftn;
      right = rightn;
    }
}
