package ch19_Queue;

public class udemy01_Queue {
    static class Queue{
        private Node first;
        private Node last;
        private int length;
        public Queue(int value){
            Node newNode = new Node(value);
            first = newNode;
            last = newNode;
            length = 1;
        }
        static class Node{
            int value;
            Node next;
            Node(int data){
                this.value = data;
            }
        }
        public void printQueue(){
            Node temp = first;
            while(temp != null){
                System.out.print(temp.value+"->");
                temp = temp.next;
            }
            System.out.println("null");
        }
        public void getFirst(){
            System.out.println("First:"+first.value);
        }
        public void getLast(){
            System.out.println("Last: "+last.value);
        }
        public void getLength(){
            System.out.println("Length:"+length);
        }
        //Enqueue means adding an element to the queue.
        public void enqueue(int value){
            Node newNode = new Node(value);
            if(length == 0){
                first = newNode;
                last = newNode;
            }
            else{
                last.next = newNode;
                last = newNode;
            }
            length++;
        }
        //Dequeue means removing an element from the queue.
        //👉 The element is always removed from the FRONT (beginning) of the queue.
        public Node dequeue(){
            if(length == 0) return null;
            Node temp = first;
            if(length == 1){
                first = null;
                last = null;
            }
            else{
                first = first.next;
                temp.next = null;
            }
            length--;
            return temp;
        }
    }
    public static void main(String[] args){
        Queue myQueue = new Queue(7);
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();
        System.out.println("Queue is:");
        myQueue.printQueue();
        myQueue.enqueue(2);
        System.out.println("After 1st enqueue operation, the queue is:");
        myQueue.printQueue();
        System.out.println("Queue is:");
        myQueue.enqueue(4);
        System.out.println("After 2nd enqueue operation, the queue is:");
        myQueue.printQueue();
        myQueue.dequeue();
        System.out.println("After the 1st dequeue operation, the queue is::");
        myQueue.printQueue();
        myQueue.dequeue();
        System.out.println("After the 2nd dequeue operation, the queue is::");
        myQueue.printQueue();

    }
}
