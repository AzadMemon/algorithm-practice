#include <cstddef>
#include <iostream>
#include "TreeNode.cpp"

class Bst {
  private:
    TreeNode* root;

  public:
    Bst(int* elements) {
      if (elements == NULL) {
        return;
      }

      int length = sizeof(elements)/sizeof(elements[0]);

      for(int i = 0; i <length; i++) {
        insert(elements[i]);
      }
    }

    int find(int element) {
      // if (root->value == NULL) {
      //
      // }
    }

    void insert(int element) {
      if (root->isNull) {
        root->setValue(element);
        return;
      }

      TreeNode* TreeNodePtr = root;
      while(TreeNodePtr != NULL) {
        if (TreeNodePtr->value > element) {
          if (TreeNodePtr->left == NULL) {
            TreeNodePtr->left->setValue(element);
          } else {
            TreeNodePtr = TreeNodePtr->left;
          }
        } else if (TreeNodePtr -> value < element) {
          if (TreeNodePtr->right == NULL) {
            TreeNodePtr->right->setValue(element);
          } else {
            TreeNodePtr = TreeNodePtr->right;
          }
        } else {
          // The element already exists in the BST
          return;
        }
      }
    }
};
