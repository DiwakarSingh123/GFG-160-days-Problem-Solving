class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
       QueueNode temp=new QueueNode(a);
       if(front==null){
           front=rear=temp;
       }
       else{
           rear.next=temp;
           rear=rear.next;
       }
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
        // Your code here
        if(front==null) return -1;
        int top=front.data;
        front=front.next;
        return top;
	}
}