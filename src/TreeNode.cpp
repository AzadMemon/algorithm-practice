class TreeNode {
  public:
    TreeNode* left;
    TreeNode* right;
    int value = -1;
    bool visited = false;
    bool isNull = true;

    TreeNode();
    void setValue(int val);
    void visit();
};

TreeNode::TreeNode() {
  TreeNode leftn;
  TreeNode rightn;

  left = &leftn;
  right = &rightn;
}

void TreeNode::setValue(int val) {
  isNull = false;
  value = val;
}

void TreeNode::visit() {
  visited = true;
}
