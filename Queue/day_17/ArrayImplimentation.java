public class ArrayImplimentation {
    public static class queueArr{
        int f=-1;
        int r=-1;
        int size=0;
        int[] arr=new int[100];

        // addition function............
        public void add(int val){
            if(r==arr.length){
                System.out.println("Queue if Full");
                return;
            }
            // if(size==0) f=r=0; Or
            if(f==-1){ // Queue is empty
                f = r = 0;
                arr[r]=val;
            }
            else{
                // [++r]=val Or
                arr[r+1]=val;
                r++;
            }
            size++;
        }

        // Remove function is here...........
        public int remove(){
            if(size==0){
                System.out.println("Queue is Empty");
                return -1;
            }
            int top=arr[f++];
            size--;
            return top;  
        }

        // Here peek function........
        public int peek(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[f];
        }

        // Here a isEmpty function for checking the queue is empty or not
        boolean isEmpty(){
            if(size==0) return true;
            return false;
        }


        // Here the function to display the queue.....
        void display(){
            if(size==0){
                System.out.println("Queue is empty");
                return;
            }
            for(int i=f;i<=r;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        
        //size of queue....................
        int size(){
            return size;
        }
    }

    public static void main(String[] args) {
        queueArr q=new queueArr();
        q.display();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.size());
    }
}
