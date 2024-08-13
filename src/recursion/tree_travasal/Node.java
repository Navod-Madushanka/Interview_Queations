package recursion.tree_travasal;

public class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int item) {
        this.data = item;
        this.left = this.right = null;
    }
}
