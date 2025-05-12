package interviewPrep.java8;

import java.sql.Array;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee1{
    private String name;
    private long salary;
    private LocalDate doj;

    public Employee1(String name, long salary, LocalDate doj) {
        this.name = name;
        this.salary = salary;
        this.doj = doj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }
}

class Student{
    private String name;
    private String grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    private String subject;

    public Student(String grade, String name, String subject) {
        this.grade = grade;
        this.name = name;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}

class Product{
    private String productName;
    private long price;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Product(String productName, long price) {
        this.productName = productName;
        this.price = price;
    }
}

class Transaction{
    private String personName;
    private long amount;

    public Transaction(String personName, long amount) {
        this.personName = personName;
        this.amount = amount;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
}
public class StreamsPractice2 {
    public static void main(String[] args) {
//        Given a list of employees, how would you retrieve the names of those who joined after 2020 and sort them by salary in descending order?
        List<Employee1> employee1List = new ArrayList<>();
        Employee1 emp1= new Employee1("Akshay",20000,LocalDate.of(2021,12,10));
        Employee1 emp2= new Employee1("Keerthana",9000000,LocalDate.of(2022,2,17));
        Employee1 emp3= new Employee1("Saketh",80000,LocalDate.of(2020,11,15));
        Employee1 emp4= new Employee1("Ajaye",1220000,LocalDate.of(2019,12,20));
        Employee1 emp5= new Employee1("Dinesh",20000,LocalDate.of(2022,10,5));
        Employee1 emp6= new Employee1("Ravi",980000,LocalDate.of(2025,11,10));
        employee1List.addAll(Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6));
        List<String> filteredEmp = employee1List.stream().filter(e->e.getDoj().isAfter(LocalDate.of(2020,12,31))).sorted(Comparator.comparing(Employee1::getSalary).reversed()).map(Employee1::getName).toList();
        System.out.println(filteredEmp);

        //How would you group a list of students by their grade and count the number of students in each group?
        List<Student> students = new ArrayList<>();
        students.add(new Student("10th", "Alice", "Math"));
        students.add(new Student("11th", "Bob", "Science"));
        students.add(new Student("12th", "Charlie", "English"));
        students.add(new Student("10th", "David", "History"));
        students.add(new Student("11th", "Eva", "Biology"));
        students.add(new Student("12th", "Frank", "Chemistry"));
        students.add(new Student("10th", "Grace", "Physics"));
        students.add(new Student("11th", "Harry", "Math"));
        students.add(new Student("12th", "Isla", "Economics"));
        students.add(new Student("10th", "Jack", "Geography"));
        students.add(new Student("11th", "Kylie", "Computer Science"));
        students.add(new Student("12th", "Leo", "Political Science"));
        students.add(new Student("10th", "Mia", "Civics"));
        students.add(new Student("11th", "Noah", "Accounts"));
        students.add(new Student("12th", "Olivia", "Psychology"));
        Map<String,Long> studentGroup = students.stream().collect(Collectors.groupingBy(Student::getGrade,Collectors.counting()));
        System.out.println(studentGroup);

        // From a list of products, how can you verify that all products have a price greater than zero?
        List<Product> products = Arrays.asList(
                new Product("Laptop", 1200),
                new Product("Smartphone", 800),
                new Product("Headphones", 150),
                new Product("Monitor", 300),
                new Product("Keyboard", 100),
                new Product("Mouse", 0),
                new Product("OS", 0)
        );
        Boolean allProductsPrice  = products.stream().allMatch(x->x.getPrice()>0);
        System.out.println("All Products has price greater than 0 "+allProductsPrice);

        //  How would you determine the second-highest salary from a list of employees?
        String highestSecondSalary = employee1List.stream().sorted(Comparator.comparing(Employee1::getSalary).reversed()).skip(1).findFirst().map(Employee1::getName).get();
        System.out.println("Highest Second Salary  ..."+highestSecondSalary);

        //  How can duplicate elements be removed from a list using Java Streams?
        List<String> friends = Arrays.asList("Ajaye","Akshay","Goutham","Goutham","Dhanush","Dhanush");
        List<String> uniqueFriends = friends.stream().distinct().toList();
        System.out.println("Unique Friends = " + uniqueFriends);

        // How would you partition a list of integers into even and odd numbers?
        List<Integer> numbers = Arrays.asList(1,2,4,3,5,6,7,8,9,10);
        Map<Boolean,List<Integer>> partitionList = numbers.stream().collect(Collectors.partitioningBy(x->x%2==0));
        System.out.println(partitionList);

        // Given a list of transactions, how can you calculate the total transaction amount for a specific customer?
        List<Transaction> transactionList = Arrays.asList(new Transaction("Dinesh",12291),new Transaction("Dinesh",1212),new Transaction("Ajaye",12121),new Transaction("Dinesh",524522),new Transaction("Ajaye",413),new Transaction("Keerthana",1313223));
        System.out.println(transactionList.stream().
                collect(Collectors.groupingBy(Transaction::getPersonName,Collectors.summingInt(x-> (int) x.getAmount()))));

        // Using Java Streams, how can you find the first non-repeating character in a string?
        String repeatingCharacter = "aksskhyhayel";
        System.out.println(repeatingCharacter.chars().mapToObj(c->(char)c).
                collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(c->c.getValue()==1).skip(1).findFirst().get());

        // How would you flatten a nested list structure (e.g., 𝗟𝗶𝘀𝘁<𝗟𝗶𝘀𝘁<𝗦𝘁𝗿𝗶𝗻𝗴>>) into a single list?
        List<List<String>> randomList = Arrays.asList(Arrays.asList("Dinesh","Akshay","Dhanush","Ajaye"),Arrays.asList("Kevin","BEN","Gwen"));
        System.out.println(randomList.stream().flatMap(List::stream).toList());

        // Get the names of all employees who are working in IT department
    }
}
