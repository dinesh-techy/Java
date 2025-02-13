package DesignPattern.BuilderPattern;

public class Phone {

    private String phoneName;
    private String operatingSystem;
    private Integer version;
    private Integer ram;
    private Integer storage;
    private Integer price;

    public Phone(String phoneName, String operatingSystem, Integer version, Integer ram, Integer storage, Integer price) {
        this.phoneName = phoneName;
        this.operatingSystem = operatingSystem;
        this.version = version;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneName='" + phoneName + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", version=" + version +
                ", ram=" + ram +
                ", storage=" + storage +
                ", price=" + price +
                '}';
    }
}
