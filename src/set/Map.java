 package set;

import collection.Employee;

import java.util.HashMap;
import java.util.UUID;

 public class Map {
    public static void main(String[] args) {
        java.util.Map<String,Employee> employeeMap = new HashMap<>();
        Employee employeeOne= createEmployee("Loi",1);
        Employee employeeTwo = createEmployee("Lan",2);
        Employee employeeThree = createEmployee("ha", 3);

        employeeMap.put(employeeOne.getUUID(),employeeOne);
        employeeMap.put(employeeTwo.getUUID(),employeeTwo);
        employeeMap.put(employeeThree.getUUID(),employeeThree);

        employeeMap.entrySet().forEach(stringEmployeeEntry -> {
            System.out.println("Key: " +stringEmployeeEntry.getKey()+ "------Value: "+employeeMap.get(stringEmployeeEntry.getKey()));

        });
    }

    private static Employee createEmployee(String name, int id){
        return new Employee( name, id,UUID.randomUUID().toString());
    }
}
