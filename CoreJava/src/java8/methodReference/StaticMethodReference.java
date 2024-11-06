package java8.methodReference;

interface MobilePhone{
    String getPhoneName(String brand,String model);
}

public class StaticMethodReference {
    public static String printName(String brand,String model){
        return brand+"....."+model;
    }
    public static void main(String[] args) {
        // With method reference
        MobilePhone nokia = StaticMethodReference::printName;
        System.out.println(nokia.getPhoneName("Nokia","Asha 305"));
        // Without method reference
        MobilePhone samsung = (brand,model)-> StaticMethodReference.printName(brand,model);
        System.out.println(samsung.getPhoneName("Samsung","S24"));
    }
}
