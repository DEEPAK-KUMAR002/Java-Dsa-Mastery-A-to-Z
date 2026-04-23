package ch17_LDS_Linked_lists;

public class tut02_linked_list_reverse {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next=newNode;
        tail = newNode;
    }
    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp =  head;
        while(temp != null){
            System.out.print(temp.data+"-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //Reverse a linked list
    public void reverse(){//0(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr !=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    //Delete nth node from end
    public void deleteNThfromEnd(int n){
        int size=0;
        Node temp = head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(n == size){
            head=head.next;
            return;
        }
        //size-n
        int i=1;
        int iTofind=size-n;
        Node prev=head;
        while(i<iTofind){
            prev=prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    //Find middle
    public Node findMid(Node head){//helper
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    //check palidrome
    public boolean CheckPalindrome(){
        if(head == null || head.next!=null){
            return true;
        }
        //step1 - find mid
        Node midNode = findMid(head);
        //step2 - Reverse 2nd half
        Node prev=null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right = prev;
        Node left = head;
        //step3 - check left half and right half
        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        tut02_linked_list_reverse ll=new tut02_linked_list_reverse();
//        ll.addFirst(1);
//        ll.addFirst(2);
//        ll.addFirst(3);
//        ll.addFirst(2);
//        ll.addFirst(1);
//        ll.print();
//        ll.reverse();
//        ll.print();
//        ll.deleteNThfromEnd(3);//n th index from end
//        ll.print();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();
        System.out.println(ll.CheckPalindrome());
    }
}
