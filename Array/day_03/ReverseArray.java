//best approch for solving that question
class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int i=0, j=arr.length-1;
        while(i<=j){
            int swap=arr[i];
            arr[i]=arr[j];
            arr[j]=swap;
            i++;
            j--;
        }
    }
}
