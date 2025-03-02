class GFG
{
    static int Level(Node root){
        if(root==null) return 0;
        return 1 + Math.max(Level(root.left), Level(root.right));
    }
    
    static void Zig(Node root,ArrayList<Integer> list, int l, int i){
        if(root==null) return;
        if(l==i){
            list.add(root.data);
            return;
        }
        
        
        
        if(i%2==0){
            
            Zig(root.left,list,l+1,i);
        }else{
           
            Zig(root.right,list,l+1,i);
        }
        
        if(i%2!=0){
           
            Zig(root.left,list,l+1,i);
        }else{
           
            Zig(root.right,list,l+1,i);
        }
        
        
    }
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	  // Firslty i found size of tree or lavel
	  int size=Level(root);
	  
	  // now i finding zigZag solution............
	  ArrayList<Integer> list=new ArrayList<>();
	  for(int i=0;i<size;i++){
	     Zig(root,list,0,i);
	      
	  }
	  return list;
	}
}