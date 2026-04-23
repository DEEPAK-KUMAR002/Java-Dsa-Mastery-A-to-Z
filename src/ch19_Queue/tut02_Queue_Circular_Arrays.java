package ch19_Queue;
public class tut02_Queue_Circular_Arrays {
    static class Queue1 {
        int arr[];
        int size;
        int rear;
        int front;
        Queue1(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }
        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }
        public boolean isFull() {
            return (rear + 1) % size == front;
        }
        // add
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }
        // remove
        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }
        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue1 q1 = new Queue1(3);
        q1.add(1);
        q1.add(2);
        q1.add(3);
        System.out.println(q1.remove());
        q1.add(4);
        System.out.println(q1.remove());
        q1.add(5);

        while (!q1.isEmpty()) {
            System.out.println(q1.peek());
            q1.remove();
        }
    }
}