// User function Template for Java
class Solution {
    public int maximumProfit(int price[]) {
        int n=price.length;
        int i=1,profit=0;
        while(i<n){
           if(price[i]>price[i-1]){
               profit+=price[i]-price[i-1];
           }
           i++;
        }
        return profit;
    }
}

// This is another wey to solving this question...............
//         int n=price.length;
//         int min=price[0], max=price[0];
//         int i=0,profit=0;
//         while(i<n){
//             while(i<n-1 && price[i]>=price[i+1]) i++;
//             min=price[i];
            
//             while(i<n-1 && price[i]<=price[i]) i++;
//             max=price[i];
//             profit+=max-min;
//         }
//         return profit;
