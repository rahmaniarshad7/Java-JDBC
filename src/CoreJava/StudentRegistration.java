public class StudentRegistration {
    int id;
    int rollN0;
    String name;
    String course;


    void studentRegistration(int id , int rollN0 , String name , String course)
    {
        this.id = id;
        this.rollN0 = rollN0;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "StudentRegistration{" +
                "id=" + id +
                ", rollN0=" + rollN0 +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    public static void main(String[] args) {
        StudentRegistration  stu = new StudentRegistration();
        stu.studentRegistration(22360 , 11 , "Arshad Rahman" , "BCA");
        System.out.println(stu);
    }
}
