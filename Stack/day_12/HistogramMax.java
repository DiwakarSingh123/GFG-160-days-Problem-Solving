class Solution {
    // Function to find largest rectangular area possible in a given histogram.
    public static int getMaxArea(int arr[]) {
        int n=arr.length;
        
        //Firstly i have to fine nextSmaller element..........
        int[] Nsmaller=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]) st.pop();
            if(st.isEmpty()){
                Nsmaller[i]=n; 
            }else{
                Nsmaller[i]=st.peek();
            }
            st.push(i);
        }
        
        //Now have to remove all element fron stack becuse i have to use for previuse smaller
        while(!st.isEmpty()) st.pop();
        
        // I have to find Previuse smaller......................
        int[] Psmaller=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]) st.pop();
            if(st.isEmpty()){
                Psmaller[i]=-1;
            }else{
                Psmaller[i]=st.peek();
            }
            st.push(i);
        }
        
        // Now finding maximum area of sum of rractangle..........
        int mx=-1;
        for(int i=0;i<n;i++){
            int curr=arr[i]*(Nsmaller[i]-Psmaller[i]-1);
            mx=Math.max(mx,curr);
        }
        
        return mx;
    }
}