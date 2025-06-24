package java8.streams;

public class Employee {

    private String empName;
    private Integer empAge;

    public Employee(String empName, Integer empAge) {
        this.empName = empName;
        this.empAge = empAge;
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
}
