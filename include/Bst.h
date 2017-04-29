#include "TreeNode.h"

class Bst {
  private:
    TreeNode* root;
  public:
    Bst(int* elements, int length);
    int find(int element);
    void insert(int element);
};
