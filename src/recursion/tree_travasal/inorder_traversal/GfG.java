package recursion.tree_travasal.inorder_traversal;

import recursion.tree_travasal.Node;

public class GfG {
    static void inorderTraversal(Node node) {
        if(node == null){
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.data+" ");
        inorderTraversal(node.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        inorderTraversal(root);
    }
}
