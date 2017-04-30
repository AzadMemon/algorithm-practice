#include <cstddef>

class TreeNode {
  public:
    TreeNode* left;
    TreeNode* right;
    int value;
    bool visited = false;
    bool isEmpty = true; // TODO: Find a better way to check if a treenode has a value

    TreeNode();
    void setValue(int val);
    void visit();
};

TreeNode::TreeNode() {
  left = NULL;
  right = NULL;
}

void TreeNode::setValue(int val) {
  isEmpty = false;
  value = val;
}

void TreeNode::visit() {
  visited = true;
}
