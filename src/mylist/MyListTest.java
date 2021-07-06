package mylist;
import java.util.List;

public class MyListTest {
    public static void main(String[] args) {
        MyList listInteger = new MyList();
        listInteger.add(1);
        listInteger.add(5);
        listInteger.add(6);
        listInteger.add(7);

        System.out.println("element 1: "+listInteger.get(0));

       // listInteger.get(6);
        //System.out.println(listInteger.get(6));

        listInteger.get(-1);
        System.out.println(listInteger.get(-1));

    }
}
