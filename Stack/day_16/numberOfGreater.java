class Solution {
    static int Greater(int[] arr, int val, int ind){
        int count=0;
        for(int i=ind;i<arr.length;i++){
            if(arr[i]>val) count++;
        }
        return count;
    }
  public static int[] count_NGEs(int N, int arr[], int q, int ind[]) {
    // code here
    //  Stack<Integer> st=new Stack<>();
     int[] num=new int[q];
     for(int i=0;i<q;i++){
         int val=arr[ind[i]];
         num[i]=Greater(arr,val,ind[i]);
     }
     return num;
  }
}