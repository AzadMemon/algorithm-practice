import java.util.ArrayList;

public class TreeNode<T> {
    private T data;
    private ArrayList<TreeNode<T>> children = new ArrayList<TreeNode<T>>();

    public TreeNode(T data) {
        this.data = data;
    }

    public TreeNode(T data, ArrayList<TreeNode<T>> children) {
        this.data = data;
        this.children = children;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void addChild(TreeNode<T> child) {
        children.add(child);
    }

    public ArrayList<TreeNode<T>> getChildren() {
        return children;
    }
}
