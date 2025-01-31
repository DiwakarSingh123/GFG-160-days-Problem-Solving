class GfG
{
    int minEle;
    Stack<Integer> s;
    Stack<Integer> s1;
    
    // Constructor    
    GfG()
	{
    s=new Stack<>();
    s1=new Stack<>();
    minEle=Integer.MAX_VALUE;
	}
	
    /*returns min element from stack*/
    int getMin()
    {
	// Your code here
	if(s.isEmpty()) return -1;
    return s1.peek();
	
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	// Your code here	
	if(s.isEmpty()) return -1;
	int top=s.pop();
	s1.pop();
	return top;
    }

    /*push element x into the stack*/
    void push(int x)
    {
	// Your code here	
	if(s.isEmpty()){
	    s.push(x);
	    s1.push(x);
	}
	else{
	    s1.push(Math.min(x,s1.peek()));
	    s.push(x);
	}
    }	
}