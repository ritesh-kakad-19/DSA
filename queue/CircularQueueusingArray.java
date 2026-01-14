package queue;

public class CircularQueueusingArray {

    static class CircularQueue
    {
        static int arr[];
        static int size;
        static int rear;
        static int front;
        
        CircularQueue(int n)
        {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;

        }

        // add
        public void add(int data)
        {

            // check is full or not
            if( isFull() )
            {
                System.out.println("queue is full");
                return;
            }

            // add first element
            if(front == -1 )
            {
                front = 0;
            } 

            
            rear = (rear + 1) % size;
            arr[rear] = data;            
        }

        // isEmpty
        public boolean isEmpty()
        {
            if(front == -1 && rear == -1)
            {
                return true;
            }
            return false;
        }

        // isFull
        public boolean isFull()
        {
            return (rear + 1) % size == front;
        }

        // remove
        public int remove()
        {
            if(isEmpty())
            {
                System.out.println("queue is empty");
                return -1;
            }

            int removedEle = front;
            

            // remove last element
            if(front == rear)
            {
                front = rear = -1;
            }else{
                front = (front + 1) % size;
            }
            return arr[removedEle];

        }

        // peek
        public int peek()
        {
            if(isEmpty())
            {
                return -1;
            }

            return arr[front];
        }

    }

    // main function
    public static void main(String[] args) {
        CircularQueue obj = new CircularQueue(3);

        obj.add(1);
        obj.add(2);
        obj.add(3);
        System.out.println(obj.remove());
        obj.add(4);
        System.out.println(obj.remove());
        obj.add(5);

        while(!obj.isEmpty())
        {
            System.out.println(obj.peek());
            obj.remove();
        }

    }
}
