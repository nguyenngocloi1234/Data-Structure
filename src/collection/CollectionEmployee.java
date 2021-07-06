package collection;

import java.util.Collection;
import java.util.Iterator;

public class CollectionEmployee {
    public static void main(String[] args) {
        Collection<Employee> collection = new java.util.ArrayList<>();

        collection.add(createEmPloyee("loi", 1));
        collection.add(createEmPloyee("lan", 2));


        Iterator<Employee> iterator=collection.iterator();
        while (iterator.hasNext()){
            Employee employeee = iterator.next();
            System.out.println(employeee.getName().toUpperCase()+employeee.getId()+" ");
        }
    }

    private static Employee createEmPloyee(String name, int id) {
        return new Employee(name, id);
    }
}
