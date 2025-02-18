class Solution {
    static void Combination(int[] arr, int tar, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> sec,int ind){
        if(ind==arr.length || tar<0) return;
        if(tar==0){
            sec.add(new ArrayList<>(list));
            return;
        }
        
        list.add(arr[ind]);
        Combination(arr,tar-arr[ind],list,sec,ind);
        
        list.remove(list.size()-1);
        
         Combination(arr,tar,list,sec,ind+1);
        
    }
    static ArrayList<ArrayList<Integer>> combinationSum(int[] arr, int tar) {
        ArrayList<Integer> list = new ArrayList<>();
         ArrayList<ArrayList<Integer>> sec = new ArrayList<>();
        Combination(arr,tar,list,sec,0);
        return sec;
    }
}