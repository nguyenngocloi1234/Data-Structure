package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListEmployee {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(creatEmployee("loi", 1));
        employees.add(creatEmployee("lan",2));

        String name ="lan";

    boolean isExist = employees.stream().anyMatch(employee ->name.equals(employee.getName())) ;
        System.out.println(name+ " isExist: "+ isExist);

// using java 8 to get all employee has name lan
    List<Employee> newEmployees = employees.stream().filter(employee -> name.equals(employee.getName())).collect(Collectors.toList());
        System.out.println(newEmployees.size()+" "+ newEmployees);

    }

    private static Employee creatEmployee(String name, int id){
        return new Employee(name, id);
    }

}
