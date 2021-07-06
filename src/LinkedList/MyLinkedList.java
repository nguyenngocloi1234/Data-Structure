package LinkedList;

public class MyLinkedList {
    private Node head;
    private Node tail;
    private int numNodes;


    public MyLinkedList() {
    }

    public MyLinkedList(Object data) {
        head =tail= new Node(data);
        numNodes++;
    }

    // class Node

    private class Node{
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    // phuong thuc add
    public void add(int index, Object data){
       if (index == 0 )
           addFirst(data);
       else if(index>=numNodes-1)
           addLast(data);
       else {
           Node temp = head;
           Node holder;

           for( int i=0; i<index -1;i++){
               temp = temp.next;          // tro toi vi tri index-1
           }

           holder = temp.next;             // vị trí chiếm chỗ index
           temp.next = new Node(data);
           temp.next.next = holder;
           numNodes++;
       }
    }

    //phuong thuc addFirst
    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    //phuong thuc addLast
    public void addLast(Object data){
        if(tail == null)
            head = tail= new Node(data);
        else
        {
            tail.next = new Node(data);
            tail = tail.next;
        }
        numNodes++;
    }

    //phuong thuc get
    public Node get(int index){
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;

        }
        return temp;
    }

    //phuong thuc printList
    public void printList(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    //phuong thuc removeFirst
    public  Object removeFirst(){
        if(numNodes==0)
            return null;
        else {
            Node temp = head;
            head = head.next;
            numNodes--;
            return temp.data;
        }
    }

    //phuong thuc removeLast
    public Object removeLast(){
        if (numNodes == 0)
            return null;
        else if(numNodes ==1){
            Node temp = head;
            head = tail = null;
            numNodes--;
            return temp.data;

        }
        else {
            Node current = head;
            for(int i=0;i<numNodes-2;i++)
                current = current.next; // tro toi tail -1
            Node temp = tail;
            tail = current.next;
            tail.next = null;
            numNodes--;
            return temp.data;
        }

    }

    //phuong thuc remove(int index)
    public Object remove(int index){
        if(index <0||index>=numNodes)
            return null;
        else if(index ==0) return removeFirst();
        else if(index == numNodes-1) return removeLast();
        else {
            Node previous = head;
            for(int i=0; i<index;i++)
                previous=previous.next;
            Node current = previous.next;
            previous.next = current.next;
            numNodes--;
            return current.data;

        }
    }

    // phương thức unlink(Node x)

    //phuong thuc remove(Object o). remove phần tử o đầu tiên nếu có.
    public boolean remove(Object o){
        if(o == null){
            for(Node x= head;x.next!=null;x= x.next){
                if(x.next.data==null){
                    x.next = x.next.next;
                    numNodes--;
                    return true;
                }
            }
        }
        else {
            for(Node x=head;x.next!=null;x=x.next){
                if(o.equals(x.data)){
                    x.next =x.next.next;
                    numNodes--;
                    return  true;
                }
            }
        }
        return false;
    }

    //phuong thuc size
    public int size(){
        return numNodes;
    }



    //phuong thuc clone la tao ra nhan bang cua mot linkedList can sao chep
    public Object clone(){
       // MyLinkedList clone = superClone();
        MyLinkedList clone = new MyLinkedList();

        //clone.head =clone.tail = null;
        clone.head = null;
        clone.numNodes = 0;
        clone.tail = null;
        //clone.nodCount = 0;

        for(Node x = head;x!=null;x=x.next)
            clone.addLast(x.data);
        return clone;
    }

    //phuong thuc indexOf(Object o) trả về index của phần tử o đầu tiên nếu có, nếu không trả về -1
    public int indexOf(Object o){
        int index =0;
        if(o == null){
            for(Node x = head; x!=null; x = x.next){
                if(x.data == null)
                    return index;
                index++;
            }
        }
        else{
            for(Node x = head; x!=null; x= x.next){
                if(o.equals(x.data))
                    return index;
            }
        }
        return -1;
    }

    //phuong thuc contains(Object o)
    public boolean contains(Object o){
        return true;
    }



}
