class Solution {
    // Function to calculate the span of stock's price for all n days.
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // write code here
        ArrayList<Integer> list=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]) st.pop();
            if(st.isEmpty()){
                list.add(i+1);
            }
            else{
                list.add(i-st.peek());
            }
            
            st.push(i);
        }
        return list;
    }
}