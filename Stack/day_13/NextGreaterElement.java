class Solution {
    // Function to find the next greater element for each element of the array.
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]>=st.peek()) st.pop();
            int top=arr[i];
            if(st.isEmpty()){
               arr[i]=-1;
            }
            else{
               arr[i]=st.peek();
            }
            st.push(top);
        }
        
        // Now adding the array value in list becuase her return type is ArrayList
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        return list;
    }
}