class Solution {
    // Function to check which sysmal prefrence is grater...........
    static int checkPrefrence(char peek){
        if(peek=='-' || peek=='+') return 1;
        if(peek=='/' || peek=='*') return 2;
        if(peek=='^') return 3;
        return -1;
    }
    
    public static String infixToPostfix(String str) {
        Stack<Character> val=new Stack<>(); // O(n) space complexcity
        StringBuilder s=new StringBuilder();// 0(1) space complexcity therfore chosing this 
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
             if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'||ch>='0'&&ch<='9')
            {
                s.append(ch);
            }
            else if(ch=='(') val.push(ch);
            else if(ch==')'){
                while(val.peek()!='('){
                    s.append(val.pop());
                    
                    
                }
                val.pop();
                
            }
           else{
                while(!val.isEmpty() && checkPrefrence(val.peek())>=checkPrefrence(ch)){
                    s.append(val.pop());
                    
                }
                val.push(ch);
            }
            
              
        }
        
        while(!val.isEmpty()){
            s.append(val.pop());
            
        }
        return s.toString();
    }
}