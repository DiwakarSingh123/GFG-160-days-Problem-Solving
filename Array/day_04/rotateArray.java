
// this is first method and better then all methods...........
// class Solution {
//     static void reverse(int[] arr,int i, int j){
//         int n=arr.length;
      
//         while(i<=j){
//             int swap=arr[i];
//             arr[i]=arr[j];
//             arr[j]=swap;
//             i++;
//             j--;
//         }
//     }
//     static void rotateArr(int arr[], int d) {
//         d=d%arr.length;
//         reverse(arr,0,d-1);
//         reverse(arr,d,arr.length-1);
//         reverse(arr,0,arr.length-1);
//     }
// }



// that is the second method taking some extra time as compered to first
class Solution {
  
    static void rotateArr(int arr[], int d) {
          d=d%arr.length;
          int n=arr.length;
          
          for(int i=0;i<d;i++){
              // becuse after splitting all element left then add first element in last
              int firstEle=arr[0];
              
              for(int j=0;j<n-1;j++){
                  arr[j]=arr[j+1];
              }
              //adding first element in last this process repeat==d times
              arr[n-1]=firstEle;
          }
      }
  }