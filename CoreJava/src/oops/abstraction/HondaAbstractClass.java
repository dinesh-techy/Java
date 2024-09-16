package oops.abstraction;

public class HondaAbstractClass extends BikeAbstractClass{
    @Override
    String changeGear() {
        return "Gear changed";
    }

    public static void main(String[] args) {
        HondaAbstractClass hondacb = new HondaAbstractClass();
        System.out.println(hondacb.changeGear());
        System.out.println(hondacb.brakeApply());
    }
}
