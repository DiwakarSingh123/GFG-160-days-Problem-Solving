class Solution {
    // Function to find maximum of each subarray of size k.
    public ArrayList<Integer> max_of_subarrays(int arr[], int k) {
        Deque<Integer> dq=new LinkedList<>();
        ArrayList<Integer> list=new ArrayList<>();
        
       // if you don't use this then your contions pass 1110 out of 1111
        if(k==0 || arr==null || arr.length==0) return new ArrayList<>();
        
        int i=0,j=0;
        while(j<arr.length){
            if(!dq.isEmpty() && dq.peekFirst()<i) dq.removeFirst(); // peek() out of i
            
            while(!dq.isEmpty() && arr[j]>arr[dq.peekLast()]) dq.removeLast();
            
            dq.addLast(j);
            
            if(j-i+1==k){
                list.add(arr[dq.peekFirst()]);
                i++;
            }
            j++;
            
        }
        return list;
        
    }
}