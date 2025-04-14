package rk_Linklist;

public class CLL {
    private Node head;
    private Node tail;

    public CLL(){
        this.head=null;
        this.tail=null;
    }
    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            this.head=node;
            this.tail=node;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }
    public void delet(int val){
        Node node=head;
        if(head == null){
            return;
        }
        if(tail == null){
            head=null;
            tail=null;
            return ;
        }
        if(node.val==val){  // "this is use to deleting head part " here we find what we find that value you want to delete
            head=head.next;
            tail.next=head;
            return ;
        }
        do{
            Node n= node.next; // n here point to the next node (the one we might delete)
            if(n.val == val){
                node.next=n.next;
                break;
            }
            node =node.next;


        }while(node!=head);
    }

//    Display
public void display() {
    Node node = head;
    if (head != null) {
        do {
            System.out.print(node.val + " -> ");
            if (node.next != null) {
                node = node.next;
            }
        } while (node != head);
    }
    System.out.println("HEAD");
}





    private class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }
}
