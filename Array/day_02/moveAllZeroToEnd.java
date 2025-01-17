//there are many methods for solving this question but i use optimised approch.
class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
       int j=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]!=0){
               int swap=arr[i];
               arr[i]=arr[j];
               arr[j]=swap;
               j++;
           }
       }
        
    }
}