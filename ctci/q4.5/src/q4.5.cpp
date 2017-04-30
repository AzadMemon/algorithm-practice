#include <cstddef>
#include <limits>
#include "Bst.h"

class Node {
  public:
    Node* left;
    Node* right;
    int value;

  Node(Node* leftn, Node* rightn, int val) {
        left = leftn;
        right = rightn;
        value = val;
    }

    void setLeftNode(Node* leftn) {
        left = leftn;
    }

    void setRightNode(Node* rightn) {
        right = rightn;
    }
};

int isBST(Node* root) {
  // int int_max = std::numeric_limits<int>::max();
  // int int_min = std::numeric_limits<int>::min();
  //
  // int leftBST = std::make_tuple(int_min, int_min);
  // int rightBST = std::make_tuple(int_max, int_max);
  //
  // if (root.left == NULL && root.right == NULL) {
  //   return std::make_tuple(root.value, root.value);
  // } else if (root.left == NULL) {
  //   rightBST = isBST(root.right);
  // } else if (root.right == NULL) {
  //   leftBST = isBST(root.left);
  // } else {
  //   leftBST = isBST(root.left);
  //   rightBST = isBST(root.right);
  // }
  //
  // if (std::get<0>(rightBST) != -1 && std::get<1>(rightBST) != -1 && std::get<1>(rightBST) > root.value &&
  // std::get<0>(leftBST) != -1 && std::get<1>(leftBST) != -1 && std::get<0>(leftBST) < root.value && ) {
  //   return (std::get<0>(rightBST), std::get<1>(leftBST));
  // } else {
  //   return std::make_tuple(-1, -1);
  // }
  return 0;
}

int main() {
  // int elements[] = {1,2,3,4};
  // Bst nah(elements, 4);
  return 0;
}
