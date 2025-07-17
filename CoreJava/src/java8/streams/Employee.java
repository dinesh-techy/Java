package java8.streams;

import java.util.StringJoiner;

public class Employee {

    private String empName;
    private Integer empAge;
    private String department;

    public Employee(String empName, Integer empAge,String department) {
        this.empName = empName;
        this.empAge = empAge;
        this.department = department;
    }

    public Employee() {
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Employee.class.getSimpleName() + "[", "]")
                .add("empName='" + empName + "'")
                .add("empAge=" + empAge)
                .add("department='" + department + "'")
                .toString();
    }
}
