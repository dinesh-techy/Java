package interviewPrep.java8.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsWithObject {

    private static class Person{
        private String personName;
        private Integer age;
        public Person(String personName, Integer age) {
            this.personName = personName;
            this.age = age;
        }

        public String getPersonName() {
            return personName;
        }

        public void setPersonName(String personName) {
            this.personName = personName;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
          new Person("Dinesh",25),
          new Person("Akshay Shadipuram",24),
          new Person("Keerthana",23),
          new Person("Sivashankar",27)
        );
        double averageAge = personList.stream().mapToInt(Person::getAge).average().orElse(0);
        System.out.println(averageAge);
    }
}
