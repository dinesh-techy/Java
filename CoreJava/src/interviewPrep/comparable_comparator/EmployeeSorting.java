package interviewPrep.comparable_comparator;

import java.util.Arrays;
import java.util.Comparator;

class Employee implements Comparable<Employee>{
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    private String name;
    private Integer age;
    Employee(String name,Integer age){
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    // Default method used for Sorting
    @Override
    public int compareTo(Employee o) {
        return this.age-o.age;
    }
    // Additional Sorting which can be used in future via Comparator
    public static Comparator<Employee> nameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.name.compareTo(o2.name);
        }
    };
}
public class EmployeeSorting {
    public static void main(String[] args) {
        Employee[] employeeList = new Employee[5];
        employeeList[0]=new Employee("Dinesh",24);
        employeeList[1]=new Employee("Ajaye",23);
        employeeList[2]= new Employee("Sivashankar",30);
        employeeList[3]=new Employee("Avinash",35);
        employeeList[4]=new Employee("Harha Bhai",10);
        // Sort list using Comparable - Use Age to compare
        Arrays.sort(employeeList);
        System.out.println("Age Sorting"+Arrays.toString(employeeList));
        // Sort list using Comparator - Use name to comparator
        Arrays.sort(employeeList,Employee.nameComparator);
        System.out.println("Name Sorting"+Arrays.toString(employeeList));
        // Comparator of above implementation in functional interface
        Arrays.sort(employeeList, (e1, e2) -> {
            return e1.getName().compareTo(e2.getName());
        });

        System.out.println("args = " + Arrays.toString(employeeList));
    }
}
