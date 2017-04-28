#include "Node.h"

class Bst {
  private:
    Node* root();

  public:
    Bst(int elements[]) {
      if (elements == NULL) {
        return;
      }

      int length = sizeof(elements)/sizeof(elements[0]);

      for(i = 0; i <length; i++) {
        insert(element[i]);
      }
    }

    int find(int element) {

    }

    void insert(int element) {
      if (root->value == NULL) {
        root->value = element;
        return;
      }

      Node* nodePtr = root;
      while(nodePtr != null) {
        if (nodePtr->value > element) {
          if (nodePtr->left == NULL) {
            nodePtr->left = Node()
          } else {
            nodePtr = nodePtr->left;
          }
        } else {
          if (nodePtr->right == NULL) {

          } else {
            nodePtr = nodePtr->right;
          }
        }
      }
    }
}
