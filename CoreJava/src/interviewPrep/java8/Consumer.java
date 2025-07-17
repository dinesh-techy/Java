package interviewPrep.java8;

import java.util.StringJoiner;

public class Consumer {
    private String consumerName;
    private Integer age;
    private String city;

    public Consumer(String consumerName, Integer age, String city) {
        this.consumerName = consumerName;
        this.age = age;
        this.city = city;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public Integer getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Consumer.class.getSimpleName() + "[", "]")
                .add("consumerName='" + consumerName + "'")
                .add("age=" + age)
                .add("city='" + city + "'")
                .toString();
    }
}
