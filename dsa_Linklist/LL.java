package rk_Linklist;

public class LL {

    private Node head;
    private Node tail;
    private int size;



    public LL() {
        this.size =0;

    }

    public void insertFirst(int val){
        Node  node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail=head;
        }
        size++;

    }
//insert at last
    public void insertAtLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
      Node node = new Node(val);
      tail.next = node;
      tail=node;
      size++;

    }

//    insert at a paricular point
    public void inserAtPArticular(int val,int index){
        if(index ==0){
            insertFirst(val);
            return;
        }
        if(index ==size){
            insertAtLast(val);
            return;
        }
//        start checking from head
        Node temp = head;
        for(int i=1;i<index;i++){
            temp =temp .next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;


    }
//    INSERT LINKEDLIST USING RECURSION
    public void insertRec(int val,int index){
        head=insertRec(val,index,head);

    }
    private Node insertRec(int val,int index ,Node node){
        if(index == 0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }
        node.next = insertRec(val,index-1,node.next);
        return node;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail =null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node scondLAst = get(size-2);
        int val = tail.value;
        tail = scondLAst;
        tail.next = null;
        return val;
    }

    public int deleteParticular(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

//    find the value
    public Node find(int value){
        Node node = head;
        while(node!= null) {//loops will run as long as node is not null
            if (node.value == value) {//checks if the current node in the linked list contains the value we are searching for
                return node;
            }


            node = node.next;
        }
        return node;
    }




    public Node get(int index){
        Node node =head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }





    public void Display(){
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.value +"->");
            temp = temp.next;
        }
        System.out.println("end");
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }


//    Duplicates elements
    public void duplicatesRem(){
        Node node =head;
        while(node.next!=null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }
            else{
                node=node.next;
            }
        }
        tail=node;
        tail.next=null;

    }

    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtLast(1);
        list.insertAtLast(1);
        list.insertAtLast(1);
        list.insertAtLast(2);
        list.insertAtLast(3);
        list.insertAtLast(3);
        list.Display();
        list.duplicatesRem();
        list.Display();
    }
}
