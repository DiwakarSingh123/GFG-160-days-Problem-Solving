class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        int sum=0;
        int maxSub=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            maxSub=Math.max(maxSub,sum);
            if(sum<0) sum=0;
        }
        return maxSub;
    }
}
