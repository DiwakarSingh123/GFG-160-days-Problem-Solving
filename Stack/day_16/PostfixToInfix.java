class Solution {
    static String postToInfix(String exp) {
       int n=exp.length();
        Stack<String> val=new Stack<>();
        
        for(int i=0;i<n;i++){
            char ch=exp.charAt(i);
            
            if(Character.isLetter(ch)) val.push(String.valueOf(ch));
            else{
                String v1=val.pop();
                String v2=val.pop();
                String op=String.valueOf(ch);
                String str="(" + v2 + op + v1 + ")";
                val.push(str);
            }
        }
        return val.peek();
    }
}