package ch18_stacks;

public class udemy01_Constructor {

    static class Stack {
        private Node top;
        private int height;

        class Node {
            int value;
            Node next;

            Node(int value) {
                this.value = value;
            }
        }

        public Stack(int value) {
            Node newNode = new Node(value);
            top = newNode;
            height = 1;
        }
        public void printStack() {
            Node temp = top;
            while (temp != null){
                System.out.print(temp.value+"-> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public void getTop() {
            System.out.println("Top: " + top.value);
        }

        public void getHeight() {
            System.out.println("Height: " + height);
        }
        public void push(int value){
            Node newNode = new Node(value);
            if(height == 0){
                top = newNode;
            }
            else{
                newNode.next = top;
                top = newNode;
            }
            height++;
        }
        public Node pop(){
            if(height == 0){
                return null;
            }
            Node temp = top;
            top = top.next;
            temp.next = null;
            height--;
            return temp;
        }
    }

    public static void main(String[] args) {
        Stack mystack = new Stack(4);
        mystack.getTop();
        mystack.getHeight();
        System.out.println("stack is:");
        mystack.printStack();
        mystack.push(1);
        mystack.push(3);
        System.out.println("stack is:");
        mystack.printStack();
        mystack.pop();
        System.out.println("stack is:");
        mystack.printStack();
    }
}
