class Solution {
    public int getMinDiff(int[] arr, int k) {
        // code here
        int n=arr.length;
         Arrays.sort(arr);
        int j=0, ans=arr[n-1]-arr[0];
        int mn=arr[0]+k;
        int mx=arr[n-1]-k;
        while(j<n-1){
            mn=Math.min(arr[j+1]-k,arr[0]+k);
            mx=Math.max(arr[j]+k,arr[n-1]-k);
            ans=Math.min(ans,(mx-mn));
            j++;
        }
        return ans;
        
    }
}