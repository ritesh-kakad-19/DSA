package queue;


// creating queue using array
public class QueueUsingArrays {

    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n)
        {
            arr = new int[n];
            size = n;
            rear = -1;

        }

        // isEmpty
        public  boolean isEmpty()
        {
            return rear == -1;
        }

        // add
        public  void add(int data)
        {
            if(rear == size-1)
            {
                System.out.println("queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        // remove 
        public  int remove()
        {
            if(isEmpty())
            {
                return -1;
            }

            int front = arr[0];
            for(int i=0; i< rear; i++)
            {
                arr[i] = arr[i+1];

            }
            rear = rear-1;
            return front;
        }

        // peek
        public  int peek()
        {
            return arr[0];
        }
    }

    // main function
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    
    
    }
}
