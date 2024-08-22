package FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentsFlatMaps {
    public static void main(String[] args) {
        List<Student> studentList1 = Arrays.asList(
                new Student(1 , "Arshad Rahman" , "A"),
                new Student(2 , "Aiman Fatma" , "B"),
                new Student(3 , "Rahul Kumar" , "A"),
                new Student(4 , "Ajay Singh" , "B"),
                new Student(5 , "Neha Sharma" , "A")
                );

        List<Student> studentList2 = Arrays.asList(
                new Student(1 , "Gold" , "A"),
                new Student(2 , "Mole" , "B"),
                new Student(3 , "Chou" , "A"),
                new Student(4 , "Mote" , "B"),
                new Student(5 , "Kaila" , "A")
        );
        List<List<Student>> finalList = Arrays.asList(studentList1 , studentList2);
        List<String> studentName = finalList.stream().flatMap(stu -> stu.stream()).map(stu -> stu.name).collect(Collectors.toList());
        System.out.println(studentName);


    }
}
class Student{
    int id;
    String name;
    String grade;

    public Student(int id , String name , String grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
}
