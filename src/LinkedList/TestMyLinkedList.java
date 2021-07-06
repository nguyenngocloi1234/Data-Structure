package LinkedList;
import java.util.LinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("Testing....");
        MyLinkedList myLinkedList = new MyLinkedList(10);
        System.out.println("size:"+myLinkedList.size());
       // myLinkedList.addFirst(11);
        //myLinkedList.addFirst(12);
        //myLinkedList.addFirst(13);
        myLinkedList.addLast(0);

       // myLinkedList.add(2,9);
        //myLinkedList.add(4,8);
        myLinkedList.addLast("lan");
        myLinkedList.addLast("lan");
        myLinkedList.addLast("loi");
        myLinkedList.addLast(9);
        myLinkedList.removeFirst();
       // myLinkedList.removeLast();
        myLinkedList.printList();
        System.out.println("size: "+myLinkedList.size());

        MyLinkedList myLinkedList1 = (MyLinkedList) myLinkedList.clone();
        myLinkedList1.printList();
        myLinkedList1.remove("lan");
        myLinkedList1.printList();

        System.out.println("size: " + myLinkedList1.size());
        System.out.println("size: " + myLinkedList.size());



    }
}
