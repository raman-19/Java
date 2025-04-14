package rk_Linklist;

public class Main {
    public static void main(String[] args) {


        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(17);
        list.insertAtLast(99);
        list.inserAtPArticular(2,1);
        list.Display();
        System.out.println(list.deleteFirst());

        list.Display();
        list.insertRec(88,3);
        list.Display();

//        System.out.println(list.deleteLast());
//        list.Display();
//        System.out.println(list.deleteParticular(2));
//        list.Display();

//        DLL list = new DLL();
//        list.InsertFirst(3);
//        list.InsertFirst(4);
//        list.InsertFirst(5);
//        list.InsertFirst(6);
//        list.InsertAtLast(99);
//        list.InsertAfter(5,66);
//        list.display();
//        list.deleteFirst();
//        list.display();
//
//        CLL list =new CLL();
//        list.insert(2);
//        list.insert(5);
//        list.insert(6);
//        list.insert(77);
//        list.delet(77);
//        list.display();

    }

}
