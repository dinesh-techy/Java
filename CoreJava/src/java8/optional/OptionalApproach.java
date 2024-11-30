package java8.optional;

import java.util.Optional;

public class OptionalApproach {
    public static void main(String[] args) {
        Car swift = new Car("Swift",null);
        Car toyato = new Car("Toyato Glanza",null);

        // Given object is not having null value -> Will throw exception if nullable
        Optional<Car> swiftOptional = Optional.of(swift);

        // Given object might have value or nullable
        Optional<Car> toyatoOptional = Optional.ofNullable(toyato);

        // Optional instance with null value
        Optional<Car> mahindra=Optional.empty();

        System.out.println(swiftOptional.isPresent());
        System.out.println(toyatoOptional.isPresent());
        System.out.println(mahindra.isEmpty());

        // Trying to access null values will throw null pointer
//        System.out.println(toyatoOptional.get().getAge());
//        System.out.println(swiftOptional.get().getAge());
        System.out.println(mahindra.orElse(new Car("No Car",0)).getName());
        Car newMahindra = mahindra.orElseGet(()->{return new Car("New newMahindra",12);});
        System.out.println(newMahindra.getName());

        Optional<Car> hyundai = Optional.empty();
        hyundai.orElseThrow();
        hyundai.orElseThrow(()->new RuntimeException("No Car Obj"));

    }
}
