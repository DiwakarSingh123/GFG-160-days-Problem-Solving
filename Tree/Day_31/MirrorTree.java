class Solution {
    static void swapped(Node root){
        if(root==null) return;
        Node swap=root.left;
        root.left=root.right;
        root.right=swap;
        swapped(root.left);
        swapped(root.right);
    }
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node root) {
        swapped(root);
       
    }
}