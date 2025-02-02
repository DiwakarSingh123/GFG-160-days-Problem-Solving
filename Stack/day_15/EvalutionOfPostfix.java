class Solution {
    public int evaluate(String[] arr) {
        Stack<Integer> val=new Stack<>();
        for(int i=0;i<arr.length;i++){
            String ch=arr[i];
            
            if(ch.equals("+") ||ch.equals("-") ||ch.equals("*") || ch.equals("/")){
                int v1=val.pop();
                int v2=val.pop();
                if(ch.equals("+"))  val.push(v2+v1);
                if(ch.equals("-"))  val.push(v2-v1);
                if(ch.equals("*"))  val.push(v2*v1);
                if(ch.equals("/"))  val.push(v2/v1);
            }else{
                val.push(Integer.parseInt(ch));
            }
            
        }
        return val.peek();
    }
}