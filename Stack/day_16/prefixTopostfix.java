class Solution {
    static String preToPost(String s) {
        // code here
        Stack<String> val=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)) val.push(String.valueOf(ch));
            else{
                String v1=val.pop();
                String v2=val.pop();
                String op=String.valueOf(ch);
                val.push(v1 + v2 + op);
                
            }
        }
        return val.peek();
    }
}