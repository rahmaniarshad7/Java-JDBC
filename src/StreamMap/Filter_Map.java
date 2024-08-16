package StreamMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Map {
    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(

                
                new Employee(101 , "Arshad Rahman" , 25000),
                new Employee(101 , "Aiman Fatma " , 21000),
                new Employee(101 , "Vishnu Kumar" , 26000),
                new Employee(101 , "Rahul Kumar" , 20000),
                new Employee(101 , "Aditya Kumar" , 19000)
        );
        List<String> name;

        name = employeeList.stream()
                .filter(emp -> emp.salary > 20000)
                .map(emp -> emp.name)
                .collect(Collectors.toList());

        System.out.println(name);
    }
}
class Employee{
    int id;
    String name;
    double salary;

    public Employee(int id , String name , double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
