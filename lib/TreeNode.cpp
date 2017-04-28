class TreeNode {
  public:
    TreeNode* left;
    TreeNode* right;
    int value = -1;
    bool visited = false;
    bool isNull = true;

    void setValue(int val) {
      isNull = false;
      value = val;
    }

    void visit() {
      visited = true;
    }
};
