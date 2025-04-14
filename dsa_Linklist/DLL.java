package rk_Linklist;

public class DLL {
    private Node head;
    private Node tail;
    private int size;




    public void InsertFirst(int value){
        Node node= new Node(value);
        node.next=head;
        node.prev =null;
        if(head!= null) {
            head.prev = node;
        }
            head=node;


    }

//    insert at lasst

    public void InsertAtLast(int val){
        Node node = new Node(val);
        Node last = head;//it creates a new reference (pointer) name Last ,and assigns it to point to the start of the list ,i.e., head

        node.next=null;
        if(head == null){
            node.prev=null;//previous of head is null
            head = node;
            return;
        }
        while(last.next != null){
            last =last.next;

        }
        last.next = node;
        node.prev = last;
    }


    public Node Find(int value){
        Node node=head;
        while(node!=null){
            if(node.val == value){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public void InsertAfter(int after,int val){
        Node p= Find(after);

        if(p == null){
            System.out.println("does not exist");
            return ;
        }
        Node node = new Node( val);
        node.next = p.next;
        p.next =node;
        node.prev=p;
        if(node.next!= null){
            node.next.prev = node;
        }

    }




//    DISPLAY
    public void display(){

        Node node =head;
        while(node!= null){
            System.out.print(node.val+"->"  );
            node = node.next;

        }
        System.out.println("END");
    }



    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;

        }
        public Node(int val,Node next,Node prev){
            this.val = val;
            this.next = next;
            this.prev=prev;
        }
    }
}
