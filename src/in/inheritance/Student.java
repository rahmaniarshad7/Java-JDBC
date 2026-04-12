package in.inheritance;

public class Student {
    int rollNo;
    String name;
    int marks;

    public Student(int rollNo , String name , int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    void display()
    {
        System.out.println(rollNo);
        System.out.println(name);
        System.out.println(marks);
    }

    public static void main(String[] args) {
        Student student = new Student(1 , "Arshad Rahman" , 87);
                student.display();
    }
}
