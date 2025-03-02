class Solution {
    static int Level(Node root){
        if(root==null) return 0;
        return 1 + Math.max(Level(root.left), Level(root.right));
    }
    
    static void DFS(Node root,ArrayList<Integer> list,int lvl){
        if(root==null) return;
        list.set(lvl,root.data);
        DFS(root.left,list,lvl+1);
        DFS(root.right,list,lvl+1);
    }
    
   ArrayList<Integer> rightView(Node root) {
       // add code here.
       int n=Level(root);
       ArrayList<Integer> list=new ArrayList<>();
       for(int i=0;i<n;i++){
           list.add(0);
       }
       
       DFS(root,list,0);
       return list;
       
   }
}
