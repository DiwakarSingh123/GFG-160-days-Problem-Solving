class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    static void inorder(ArrayList<Integer> list, Node root){
        if(root==null) return;
        list.add(root.data);
        inorder(list,root.left);
       
        inorder(list,root.right);
    }
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> list=new ArrayList<>();
        inorder(list,root);
        return list;
    }
}