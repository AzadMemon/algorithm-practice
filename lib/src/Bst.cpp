#include <cstddef>
#include <iostream>
#include "TreeNode.h"

class Bst {
  private:
    TreeNode* root;
    TreeNode* init(int* element, int start, int end);
  public:
    Bst(int* elements, int length);
    int find(int element);
    void insert(int element);
};

Bst::Bst(int* elements, int length) {
  if (elements == NULL) {
    return;
  }

  root = init(elements, 0, length);
}

TreeNode* Bst::init(int* elements, int start, int end) {
  if (end < start) {
    return NULL;
  }

  int midIndex = (end - start)/2;

  TreeNode* node;
  node->setValue(elements[midIndex]);

  node->left = init(elements, 0, midIndex);
  node->right = init(elements, midIndex + 1, end);

  return node;
}

int Bst::find(int element) {
  // if (root->value == NULL) {
  //
  // }
}

void Bst::insert(int element) {
  if (root->isEmpty == true) {
    root->setValue(element);
    return;
  }


  TreeNode* nodePtr = root;
  while(nodePtr != NULL) {
    if (nodePtr->value > element) {
      if (nodePtr->left == NULL) {
        TreeNode node;
        nodePtr->left = &node;
        nodePtr->left->setValue(element);
        nodePtr = NULL;
      } else {
        nodePtr = nodePtr->left;
      }
    } else if (nodePtr -> value < element) {
      if (nodePtr->right == NULL) {
        TreeNode node;
        nodePtr->right = &node;
        nodePtr->right->setValue(element);
        nodePtr = NULL;
      } else {
        nodePtr = nodePtr->right;
      }
    } else {
      // The element already exists in the BST
      return;
    }
  }
}
