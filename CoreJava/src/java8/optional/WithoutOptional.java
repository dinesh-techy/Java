package java8.optional;

import java.util.Arrays;

class Car {
    String name;
    Integer age = null;

    public Car(String name, Integer age) {
        this.name = name;
        this.age = age;
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
}

public class WithoutOptional {
    public static void main(String[] args) {
        Car tata = new Car("Tata Altroz", null);

        // This will throw a NullPointerException because age is null
//        System.out.println("Age in years: " + tata.getAge().toString());

        //Traditional way
        if(tata.getAge()!=null){
            System.out.println("Age in years: " + tata.getAge().toString());
        }
        else{
            System.out.println("Null");
        }
    }
}
