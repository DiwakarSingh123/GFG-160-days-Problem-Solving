class Solution {
    // converting prefix to infix
    static String preToInfix(String pre_exp) {
        int n=pre_exp.length();
        Stack<String> val=new Stack<>();
        
        for(int i=n-1;i>=0;i--){
            char ch=pre_exp.charAt(i);
            
            if(Character.isLetter(ch)) val.push(String.valueOf(ch));
            else{
                String v1=val.pop();
                String v2=val.pop();
                String op=String.valueOf(ch);
                String str="(" + v1 + op + v2 + ")";
                val.push(str);
            }
        }
        return val.peek();
    }
}
