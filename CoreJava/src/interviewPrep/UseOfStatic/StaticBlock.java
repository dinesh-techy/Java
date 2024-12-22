package interviewPrep.UseOfStatic;


class Employee{
    private String employeeName;
    private Integer employeeAge;
    static String office;
//    static class NestedStaticClass{
//        void display(){
//            System.out.println(office); // Prints office
//            System.out.println(employeeName); // Non-static field 'employeeName' cannot be referenced from a static context
//        }
//    }
    static {
        System.out.println("Static Block of employee executed"); // Loaded when the class is loaded in memory
        office="TCS"; // Set the value for a static member
    }
    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeAge=" + employeeAge +
                ", office=" + office +
                '}';
    }

}
public class StaticBlock {
    static {
        System.out.println("Static block Executed before main class ");
    }
    public static void main(String[] args) {
        System.out.println("Static Class started...");
        Employee e1 = new Employee();
    }
}
