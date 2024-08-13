package recursion.tree_travasal.preorder_traversal;

import recursion.tree_travasal.Node;

public class GfG {
    static void preorderTraversal(Node node) {
        if (node == null){
            return;
        }
        System.out.print(node.data + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        preorderTraversal(root);
    }
}
