class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
}