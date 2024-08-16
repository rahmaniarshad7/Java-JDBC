package StreamAPI_Filter;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo5 {
    public static void main(String[] args)
    {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1 , "Arshad Rahman" , 20));
        employeeList.add(new Employee(1 , "Alta mash Rahman" , 17));
        employeeList.add(new Employee(1 , "Aiman Fatma" , 18));
        employeeList.add(new Employee(1 , "Alisa Fatma" , 8));
        employeeList.add(new Employee(1 , "Alina Fatma" , 12));
        employeeList.add(new Employee(1 , "Akash Kumar" , 23));
        employeeList.add(new Employee(1 , "Rahul Kumar" , 21));

        employeeList.stream().filter(i -> i.age >= 20).forEach(p -> System.out.println(p.name));
        System.out.println(employeeList.size());



    }
}

class Employee{
    int id;
    String name;
    int age;

    public Employee(int id , String name , int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
