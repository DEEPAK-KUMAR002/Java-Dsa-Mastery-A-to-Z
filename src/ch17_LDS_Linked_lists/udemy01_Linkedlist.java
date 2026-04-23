package ch17_LDS_Linked_lists;
public class udemy01_Linkedlist {
    private Node head;
    private Node tail;
    private int length;
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    public udemy01_Linkedlist(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public void printlist(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value+"-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void getHead(){
        System.out.println("Head:"+head.value);
    }
    public void getTail(){
        System.out.println("Tail:"+tail.value);
    }
    public void getLength(){
        System.out.println("Length:"+length);
    }
    //append in linked list
    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
    //Remove last element in linked list
    public Node removeLast(){
        if(length == 0) return  null;
        Node temp = head;
        Node pre = head;
        while (temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }
    //Add at the beginning of linked list
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }
    // Remove first item in linked list
    public Node removeFirst(){
        if(length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length == 0){
            tail = null;
        }
        return temp;
    }
    // get a item using index
    public Node get(int index){
        if(index < 0 || index >= length){
            return null;
        }
        Node temp = head;
        for(int i = 0;i<index;i++){
            temp = temp.next;
        }
        return temp;
    }
    //Set the value at any index
    public boolean set(int index,int value){
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }
    //Insert a new node at particular value
    public boolean insert(int index,int value){
        if(index < 0 || index > length) return false;
        if(index == 0){
            prepend(value);
            return true;
        }
        if(index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index-1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }
    //Remove a item at particular index
    public Node removeitemindex(int index){
        if(index < 0 || index >= length) return null;
        if(index == 0) return removeFirst();
        if(index == length-1) return removeLast();
        Node prev = get(index-1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }
    //Reverse a linked list
    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for(int i=0;i<length;i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
    public static void main(String[] args){
        udemy01_Linkedlist myLinkedlist = new udemy01_Linkedlist(12);
        myLinkedlist.getHead();
        myLinkedlist.getTail();
        myLinkedlist.getLength();
        System.out.println("Print before append:");
        myLinkedlist.printlist();
        myLinkedlist.append(9);
        myLinkedlist.append(11);
        myLinkedlist.append(21);
        myLinkedlist.append(19);
        myLinkedlist.append(29);
        System.out.println("Print after append:");
        myLinkedlist.printlist();
        myLinkedlist.getLength();
        System.out.println("Remove last element in linked list:");
        myLinkedlist.removeLast();
        myLinkedlist.printlist();
        myLinkedlist.prepend(1);
        System.out.println("Add element at beginning of linked list:");
        myLinkedlist.printlist();
        myLinkedlist.removeFirst();
        System.out.println("Remove first item in linked list:");
        myLinkedlist.printlist();
        System.out.println("item at 1st index:"+myLinkedlist.get(1).value);
        System.out.println("item at 4th index:"+myLinkedlist.get(4).value);
        myLinkedlist.printlist();
        System.out.println("Set a value at index 1:");
        myLinkedlist.set(1,4);
        myLinkedlist.printlist();
        System.out.println("Insert a value at index 2nd:");
        myLinkedlist.insert(2,100);
        myLinkedlist.printlist();
        System.out.println("Remove a item at index 2:");
        myLinkedlist.removeitemindex(2);
        myLinkedlist.printlist();
        System.out.println("Reverse a linked list:");
        myLinkedlist.reverse();
        myLinkedlist.printlist();
    }
}
