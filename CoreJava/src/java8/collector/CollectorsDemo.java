package java8.collector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Student{
    private int id;
    private String name;
    private int rank;

    public Student(int id, String name, int rank) {
        this.id = id;
        this.name = name;
        this.rank = rank;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rank=" + rank +
                '}';
    }
}

public class CollectorsDemo {
    public static void main(String[] args) {
        // asList()
        List<Student> studentList = Arrays.asList(new Student(1,"Dinesh",2),new Student(2,"Siva",10),new Student(3,"Ak",5),new Student(1,"Dinesh",2));
        List<String> studentNames = studentList.stream().map(student -> student.getName()).collect(Collectors.toList());
        System.out.println(studentNames);
        // toSet()
        Set<String> uniqueStudentList = studentList.stream().map(student -> student.getName())
                .collect(Collectors.toSet());
        System.out.println(uniqueStudentList);

        // Summing the rank
        Integer sumOfRank = studentList.stream().collect(Collectors.summingInt(student->student.getRank()));
        System.out.println(sumOfRank);

        // Averaging the value
        Double averageRank = studentList.stream()
                .collect(Collectors.averagingInt(student->student.getRank()));
        System.out.println(averageRank);

        // Count
        Long countOfStd = studentList.stream()
                .collect(Collectors.counting());
        System.out.println(countOfStd);

        // Joining
        String joinedName = studentList.stream().map(student -> student.getName()).collect(Collectors.joining(","));
        System.out.println(joinedName);
    }
}
