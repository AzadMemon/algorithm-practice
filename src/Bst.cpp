#include <cstddef>
#include <iostream>
#include "TreeNode.h"

class Bst {
  private:
    TreeNode* root;
  public:
    Bst(int* elements, int length);
    int find(int element);
    void insert(int element);
};

Bst::Bst(int* elements, int length) {
  TreeNode rootn;
  std::cout << "HI" << std::endl;
  root = &rootn;

  if (elements == NULL) {
    return;
  }

  for(int i = 0; i <length; i++) {
    insert(elements[i]);
  }
}

int Bst::find(int element) {
  // if (root->value == NULL) {
  //
  // }
}

void Bst::insert(int element) {
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
