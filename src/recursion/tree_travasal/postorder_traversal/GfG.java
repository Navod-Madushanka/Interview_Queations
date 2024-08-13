package recursion.tree_travasal.postorder_traversal;

import recursion.tree_travasal.Node;

public class GfG {
    static void postOrderTraversal(Node node) {
        if(node == null){
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data + " ");
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        postOrderTraversal(root);
    }
}
