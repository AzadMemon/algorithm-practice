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
