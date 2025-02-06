static List<Integer> FirstNegativeInteger(int arr[], int k) {
    ArrayList<Integer> list=new ArrayList<>();
    Queue<Integer> q=new LinkedList<>();
    int j=0,i=0;
    
    // for(int l=0;l<arr.length;l++){
    //     if(arr[l]<0) q.add(l);
    // }
    while(j<arr.length){
      
       if(arr[j]<0) q.add(j);
       
      if(j-i+1==k){
          if(!q.isEmpty() && q.peek()<i){
              q.remove();
              
          }
          
          if(!q.isEmpty()) list.add(arr[q.peek()]);
          // this else is checked two condition 
          //1:- if both element are non-negative then
          else{ 
             list.add(0);
          }
          
          i++;
      }
      j++;
       
    }
    return list;
}
}