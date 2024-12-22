package interviewPrep.UseOfStatic;

import java.util.Arrays;

class Student{
    private String studentName;
    private String studentCourse;
    static String collegeName="RMK Engineering College"; // Static variable which will be shared across all the objects

    public Student(String studentName, String studentCourse) {
        this.studentName = studentName;
        this.studentCourse = studentCourse;
    }
    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentCourse='" + studentCourse + '\'' +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }
    static void changeCollegeName(String newCollegeName){
        collegeName=newCollegeName;
    }
}

public class StaticExample {
    public static void main(String[] args) {
        System.out.println("Static variable");
        Student dinesh = new Student("Dinesh","EIE");
        Student ajaye=new Student("Ajaye","CSE");
        System.out.println(dinesh);
        System.out.println(ajaye);
        Student.collegeName="SVC Engineering College";// Change the value of static variable will reflect in all obj
        System.out.println(dinesh);
        Student.changeCollegeName("ST JOSEPH Engineering College");
        System.out.println(ajaye); // Static method accessed without instance creation
    }
}
