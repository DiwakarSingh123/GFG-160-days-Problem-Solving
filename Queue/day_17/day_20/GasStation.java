class Solution {
    public int startStation(int[] gas, int[] cost) {
        Queue<Integer> q=new LinkedList<>();
        int currSum=0,sum=0,index=0;
        // checking at starting point of positive number..........
       for(int i=0;i<gas.length;i++){
           int diff=gas[i]-cost[i];
           sum+=diff;
           currSum+=diff;
           
           if(currSum<0){
               index=i+1;
               currSum=0;
           }
       }
       return sum>=0 ? index :-1;
    }
}