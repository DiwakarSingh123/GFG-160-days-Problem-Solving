class Solution {
    // Function to find all possible paths
    static void FindRoot(ArrayList<ArrayList<Integer>> mat, int i, int j,int[][] list,ArrayList<String> str, String s){
        if(i==mat.size()-1 && j==mat.get(0).size()-1){
            str.add(s);
            return;
        }   
        
        list[i][j]=1;
        
       
        
       
        
        // down check.........
        if( i+1<mat.size() && list[i+1][j]!=1  && mat.get(i+1).get(j)!=0){
            // s+='D';
            FindRoot(mat,i+1,j,list,str,s + 'D');
        }
        
        // left check.........
        if(j>0 && list[i][j-1]!=1 && mat.get(i).get(j-1)!=0){
            // s+='L';
            FindRoot(mat,i,j-1,list,str,s + 'L');
        }
        
        
         // Right check.........
        if(j+1<mat.get(0).size() && list[i][j+1]!=1 && mat.get(i).get(j+1)!=0){
            // s+='R';
            FindRoot(mat,i,j+1,list,str,s + 'R');
        }
        
         // up check.........
        if(i>0 && list[i-1][j]!=1 &&  mat.get(i-1).get(j)!=0){
            // s+='U';
            FindRoot(mat,i-1,j,list,str,s + 'U');
        }
        list[i][j]=0; // again unmarks
        
    }
    
    public ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
        ArrayList<String> str=new ArrayList<>();
        // ArrayList<ArrayList<Integer>> list=ArrayList<>();
        int n=mat.size();
        int m=mat.get(0).size();
        int[][] list=new int[mat.size()][mat.get(0).size()];
        
        if(mat.get(0).get(0)==0 || mat.get(n-1).get(m-1)==0) return str;
        FindRoot(mat,0,0,list,str,"");
        return str;
    }
}