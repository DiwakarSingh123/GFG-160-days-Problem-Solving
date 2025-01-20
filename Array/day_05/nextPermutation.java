class Solution {
    // reversing the array from pivotNext element to array last elements
    static void reverse(int[] arr, int pivotNext){
        int n=arr.length;
        int i=pivotNext,j=n-1;
        while(i<=j){
            int swap=arr[i];
            arr[i]=arr[j];
            arr[j]=swap;
            i++;
            j--;
        }
    }
    
    void nextPermutation(int[] arr) {
        // firstly find pivot element........
        int pivot=-1;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                pivot=i-1;
                break;
            }
        }
        
        if(pivot==-1){
            reverse(arr,0);
            return;
        }
        // Now after the pivot element all element are in decressing order means unsey bada element ka sequence nahi ban sakta
        // Now we find just next greater element of pivot from pivot next index to arr length tak
         for(int i=arr.length-1;i>pivot;i--){
            if(arr[i]>arr[pivot]){
                int swap=arr[i];
                arr[i]=arr[pivot];
                arr[pivot]=swap;
                break;
            }
        }
        
        reverse(arr,pivot+1);
    }
}