package interviewPrep.equalsAndHashCode;

import java.util.Objects;

class Employee{
    private String name;
    private Integer age;
    public Employee(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Check if both objects are the same
        if (o == null || getClass() != o.getClass()) return false; // Check for null or different class
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(age, employee.age);
    }
}

public class ComparisonTypes {
    public static void main(String[] args) {
        Employee dinesh = new Employee(24,"Dinesh");
        Employee dinesh1 = new Employee(24,"Dinesh");
        // Shallow comparison
        System.out.println("Shallow Comparison:::"+(dinesh1==dinesh));
        // Deep comparison
        System.out.println("Deep Comparison:::"+(dinesh1.equals(dinesh)));
    }
}
