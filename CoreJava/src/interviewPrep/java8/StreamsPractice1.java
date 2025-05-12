package interviewPrep.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

class Employee {
    String name;
    int age;
    double salary;
    String department;
    List<String> skills;

    public Employee(String name, int age, double salary, String department, List<String> skills) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", skills=" + skills +
                '}';
    }
}

public class StreamsPractice1 {

    public static void main(String[] args) {
        // Basics & Common Operations
        System.out.println("**** Basic & Common Operation ****");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        // Get all even numbers
        List<Integer> evenNumbers = numbers.stream().filter(x->x%2==0).toList();
        // Multiply each number by 2.
        List<Integer> multiplyByTwo = numbers.stream().map(x-> x*2).toList();
        // Find sum, average, min, max.
        Integer sumOfNumbers = numbers.stream().reduce(0,(a,b)->a+b);
        Integer averageOfNumbers = numbers.stream().reduce(0,(a,b)->a+b).intValue()/numbers.size();
        Integer minNumber = numbers.stream().min(Integer::compare).get();
        Integer maxNumber = numbers.stream().max(Integer::compare).orElse(-1);
        // Skip first 2 elements and collect the rest.
        List<Integer> skippedList = numbers.stream().skip(2).toList();
        // Limit to first 3 elements and collect.
        List<Integer> limittedList = numbers.stream().limit(3).toList();
        System.out.println("Even numbers..."+evenNumbers);
        System.out.println("Multiply by 2 numbers..."+multiplyByTwo);
        System.out.println("Sum of Numbers.."+sumOfNumbers+"..."+"...Average of Numbers..."+averageOfNumbers+"...minNumber..."+minNumber+"...maxNumber..."+maxNumber);
        System.out.println("Skipped List..."+skippedList);
        System.out.println("Limited List..."+limittedList);

        System.out.println("**** Intermediate Operations ****");
//        Intermediate Operations with Custom Class
        List<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee("Dinesh",25,25000,"IT",new ArrayList<>(Arrays.asList("Java","C","C++")));
        Employee emp2 = new Employee("Ajaye",30,250000,"Cloud Developer",new ArrayList<>(Arrays.asList("AWS","Azure")));
        Employee emp5 = new Employee("Dhanush",30,250000,"Cloud Developer",new ArrayList<>(Arrays.asList("C#","DSA")));
        Employee emp3 = new Employee("Akshay",23,100000,"WCS Developer",new ArrayList<>(Arrays.asList("C#","WCS")));
        Employee emp4 = new Employee("Keerthana",40,1000000,"Manager",new ArrayList<>(Arrays.asList("C#","DSA")));
        employeeList.addAll(Arrays.asList(emp1,emp2,emp3,emp4,emp5));
        // Get names of employees in "IT" department.
        List<String> employeeNames = employeeList.stream().map(Employee::getName).filter(e-> emp1.getDepartment().equals("IT")).toList();
        // Get average salary of employees over 30 years old.
        Double averageSalary = employeeList.stream().filter(x->x.getAge()>=30).mapToDouble(Employee::getSalary).average().getAsDouble();
        // Find highest paid employee.
        String highPaidEmployee = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary)).get().name;
        // List distinct departments.
        List<String> distinctDepartments = employeeList.stream().map(Employee::getDepartment).distinct().toList();
        // Sort employees by salary descending.
        List<Employee> sortedEmployees = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).toList();
        System.out.println("Employee Names "+employeeNames);
        System.out.println("Employee Avg Salary "+averageSalary);
        System.out.println("Highest paid Employee "+highPaidEmployee);
        System.out.println("Distinct Departments "+distinctDepartments);
        System.out.println("Sorted employee List "+sortedEmployees);

        System.out.println("**** Grouping & Partitioning *****");
        // Group employees by department
        Map<String,List<Employee>> empDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        Map<String, List<String>> empDeptNames = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toList())));
        // Partition employees by age > 30.
        Map<Boolean,List<Employee>> empPart = employeeList.stream().collect(Collectors.partitioningBy(e->e.getAge()>=30));
        // Count employees in each department.
        Map<String,Long> employeePerDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        // Find highest paid employee per department.
        Map<String,Optional<Employee>> highestPaidEmp = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println("Employees by department "+empDept);
        System.out.println("Employees Partitoning "+empPart);
        System.out.println("Employees per Department "+employeePerDept);
        System.out.println("Highest paid Employee "+highPaidEmployee);

        System.out.println("**** Working with Sets, Arrays, and Strings ****");
        // Working with Sets, Arrays, and Strings
        Set<String> cities = Set.of("Delhi", "Mumbai", "Bangalore");
        String[] fruits = {"apple", "banana", "apple", "orange"};
        String sentence = "java streams are powerful and expressive";

        // Convert Set to List and sort alphabetically.
        List<String> listCities = cities.stream().collect(Collectors.toList());
        // Count unique fruits in array.
        List<String> uniqueFruits = Arrays.stream(fruits).distinct().toList();
        // Find the longest word in the sentence.
        String longestWord = Arrays.stream(sentence.split("\s+")).max(Comparator.comparing(String::length)).get();
        // Print frequency of each word in the sentence.
        Map<Integer,List<String>> wordFreq = Arrays.stream(sentence.split("\s+")).collect(Collectors.groupingBy(String::length));
        System.out.println("Set to List "+listCities);
        System.out.println("Distinct Fruits "+uniqueFruits);
        System.out.println("Longest word "+longestWord);
        System.out.println("Frequency of words "+wordFreq);

        // FlatMap & Optional
        System.out.println("***** FlatMap & Optional *****");
        // Given List<List<String>>, flatten into a single list of strings.
        List<List<String>> listOfList = new ArrayList<>();
        List<String> vegetables = new ArrayList<>(Arrays.asList("Carrot",null,"Cucumber","Betroot"));
        List<String> trees = new ArrayList<>(Arrays.asList("Banyan Tree","Mango Tree",null));
        listOfList.add(vegetables);
        listOfList.add(trees);
        listOfList.add(trees);
        // Given List<List<String>>, flatten into a single list of strings.
        List<String> flattenedString = listOfList.stream().flatMap(List::stream).toList();
        // Extract non-null values from List<Optional<String>>
        List<String> nonNullList = flattenedString.stream().filter(x->x!=null).toList();

        // From a List<Employee>, get all skills (assume List<String> skills in Employee)
        List<String> allSkillsList = employeeList.stream().map(Employee::getSkills).toList().stream().flatMap(List::stream).toList();
        System.out.println("All skills list "+allSkillsList);
        System.out.println("No null list "+nonNullList);
        System.out.println("Flattened list "+flattenedString);

        // Advanced Collectors
        System.out.println("***** Advanced Collectors *****");
        // Join all employee names into a comma-separated string
        String nameList = employeeList.stream().map(Employee::getName).toList().stream().collect(Collectors.joining(","));
        // Convert List<Employee> to Map<String, Employee> using name as key.
        // Create a Map<String, List<Employee>> grouped by department.
        Map<String,List<Employee>> employeeGroup = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("String namelist "+nameList);
        System.out.println("Employee Group by Dept "+employeeGroup);
        // Parallel Streams & Primitive Streams
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        Integer sumOfNums = Arrays.stream(nums).parallel().sum();
        System.out.println("Sum of Numbers "+sumOfNums);
        Double averageNums = IntStream.of(nums).average().getAsDouble();
        System.out.println("Average of Numbers "+averageNums);
        List<Integer> oddNumbers = IntStream.of(nums).filter(x->x%2!=0).boxed().collect(Collectors.toList());
        System.out.println("Odd Numbers "+oddNumbers);

        // 8. Real-World Scenarios
        System.out.println("******  Real-world scenarios  ******");
        // Find top 3 highest-paid employees
        List<String> topThreeEmployees = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).map(Employee::getName).toList();
        // Filter employees whose name starts with “A” and are from "HR" department.
        List<Employee> filteredEmp = employeeList.stream().filter(employee -> employee.getDepartment().equals("Cloud Developer") && employee.getName().charAt(0)=='D').toList();
        // Find common elements from two lists using streams.
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,5,6,7));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(2,3,5,10,12,15));
        List<Integer> commonElements = list1.stream().filter(element->list2.contains(element)).toList();
        System.out.println("Filtered Employee "+filteredEmp);
        System.out.println("Top 3 High Paid Employees "+topThreeEmployees);
        System.out.println("Common elements "+commonElements);

        // Practice with Character Input
        System.out.println("******  Practice Character Input ******");
        String input = "helloWorld123!";
        // Convert the string into a list of characters.
        List<Character> characterList = input.chars().mapToObj(x->(char)x).toList();
        // Count the number of vowels in the string.
        Long vowelsCount = input.chars().filter(c->"aeiouAEIOU".indexOf(c)!=-1).count();
        // Remove all digits and collect the rest into a new string.
        String onlyString = input.chars().mapToObj(x->(char)x).filter(c->Character.isAlphabetic(c)).map(String::valueOf).collect(Collectors.joining());
        // Count frequency of each character (excluding spaces).
        Map<Character, Long> frequencyMap = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> !Character.isWhitespace(c))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        // Print only unique characters (appearing once).
        Map<Character,Long> freqMap = input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(x->x,Collectors.counting()));
        List<Character> uniqueCharacters = freqMap.entrySet().stream().filter(x->x.getValue()==1).map(Map.Entry::getKey).toList();
        // Sort the characters alphabetically and return as a string.
        String alphabeticSorted = input.chars().mapToObj(c->(char) c).sorted().map(String::valueOf).collect(Collectors.joining());
        // Count number of uppercase characters.
        Long numberOfUpperCase = input.chars().filter(Character::isUpperCase).count();
        // Group characters by whether they are letters, digits, or symbols.
        Map<String,List<Character>> groupCharacters = input.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->{
                    if(Character.isDigit(c)){
                        return "Number";
                    }
                    else if(Character.isAlphabetic(c)){
                        return "Character";
                    }
                    else{
                        return "Symbol";
                    }
                }));
        System.out.println("Character List..."+characterList);
        System.out.println("Vowels count..."+vowelsCount);
        System.out.println("Only String..."+onlyString);
        System.out.println("Frequency Map "+frequencyMap);
        System.out.println("Unique Characters "+uniqueCharacters);
        System.out.println("Alphabetic sorted "+alphabeticSorted);
        System.out.println("Number of UpperCase "+numberOfUpperCase);
        System.out.println("Group characters "+groupCharacters);
        Character firstNonRepeatCharacter = input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(x->x.getValue()==1).limit(1).map(Map.Entry::getKey).findFirst().get();
        System.out.println("First Non repeating character "+firstNonRepeatCharacter);

    }
}
