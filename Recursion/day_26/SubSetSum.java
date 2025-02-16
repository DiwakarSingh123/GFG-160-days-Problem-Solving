class Solution {
        
    static void Sum(ArrayList<Integer> list, ArrayList<Integer> sum){
     int num=0;
     for (int i = 0; i <list.size(); i++) {
         num+=list.get(i);
     }
     sum.add(num);
   }
   
    static void  subsetSum(int[] arr, int ind, ArrayList<Integer> sum, ArrayList<Integer> list){
       if(ind==arr.length){
           Sum(list,sum);
           return;
       }
       list.add(arr[ind]);
       subsetSum(arr,ind+1,sum,list);

       if(!list.isEmpty()) list.remove(list.size()-1);

       subsetSum(arr,ind+1,sum,list);
   }
public ArrayList<Integer> subsetSums(int[] arr) {
   // code here
   ArrayList<Integer> list=new ArrayList<>();
   ArrayList<Integer> sum=new ArrayList<>();
   subsetSum(arr,0,sum,list);
   return sum;
}
}