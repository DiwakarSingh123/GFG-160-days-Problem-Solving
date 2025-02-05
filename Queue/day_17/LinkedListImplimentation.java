class Node{ // user Defined datatype
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}

public class LinkedListImplimentation {

public static class queueLL{
    Node head=null;
    Node tail=null;
    int size=0;

    // add function is here........
     void add(int x){
        Node temp=new Node(x);
        if(size==0){
            head=tail=temp;
            size++;
            return;
        }
        tail.next=temp;
        size++;
        tail=temp;
    }

    // remove function is here.......
    public int remove(){

        if(size==0){
            System.out.println("Queue is Empty");
            return -1;
        }
        int top=head.val;
        head=head.next;
        size--;
        return top;
    }

    // peek function is here...........
    public int peek(){
        if(size==0){
            System.out.println("Queue is Empty");
            return -1;
        }
        return head.val;
    }

    // here Display function..........
    public void display(){
        if(size==0){
            System.out.println("Queue is Empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    //  size hai...............
    int size(){
        return size;
    }

    // Kya ye empty hai.........
    boolean isEmpty(){
        if(size==0) return true;
        return false;
    }
}
    public static void main(String[] args) {
        queueLL q=new queueLL();
        q.display();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.display();
        System.out.println(q.remove());
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.isEmpty());
    }
}
