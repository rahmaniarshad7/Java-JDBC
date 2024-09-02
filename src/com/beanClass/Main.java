package com.beanClass;

public class Main
{

    void registerStudent(StudentBean studentBean1)
    {
        System.out.println(studentBean1.getId());
        System.out.println(studentBean1.getRollNo());
        System.out.println(studentBean1.getName());
        System.out.println(studentBean1.getCourseName());
    }

    public static void main(String[] args)
    {
        StudentBean student = new StudentBean();
        student.setName("Ankit");
        student.setCourseName("BCA");
        student.setId(22360);
        student.setRollNo(111);
        Main main = new Main();
        main.registerStudent(student);

    }

}
