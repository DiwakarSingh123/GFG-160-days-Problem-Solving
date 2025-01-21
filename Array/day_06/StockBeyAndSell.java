class Solution {
    public int maximumProfit(int price[]) {
        int i=0,j=0;
        int pro=0;
        int curr=0;
        while(j<price.length){
            if(price[i]>price[j]){
                i=j;
            }
            
            pro=Math.max(pro,(price[j]-price[i]));
            
            j++;
        }
        return pro;
    }
}