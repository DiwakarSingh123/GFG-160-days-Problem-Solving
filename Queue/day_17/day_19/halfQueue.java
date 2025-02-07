class Solution {
    public static ArrayList<Integer> rearrangeQueue(int N, Queue<Integer> q) {
        // code here
        int n=q.size();
        ArrayList<Integer> list=new ArrayList<>();
        int[] arr=new int[n/2];
        for(int i=0;i<arr.length;i++){
            arr[i]=q.remove();
        }
        
        int j=0;
        while(!q.isEmpty()){
            list.add(arr[j]);
            list.add(q.remove());
            j++;
        }
        return list;
    }
}