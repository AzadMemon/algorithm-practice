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
