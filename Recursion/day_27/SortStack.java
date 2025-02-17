class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        int[] arr=new int[s.size()];
        int k=0;
        while(!s.isEmpty()){
            arr[k++]=s.pop();
        }
        
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            s.push(arr[i]);
        }
        return s;
    }
}