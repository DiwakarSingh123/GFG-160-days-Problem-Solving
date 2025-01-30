class twoStacks {
    Stack<Integer> str1;
    Stack<Integer> str2;
    twoStacks() {
        str1=new Stack<>();
        str2=new Stack<>();
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        // code here
        str1.push(x);
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        // code here
        str2.push(x);
    }

    // Function to remove an element from top of the stack1.
    int pop1() {
        // code here
        if(str1.isEmpty()) return -1;
        return str1.pop();
    }

    // Function to remove an element from top of the stack2.
    int pop2() {
        // code here
        if(str2.isEmpty()) return -1;
        return str2.pop();
        
    }
}