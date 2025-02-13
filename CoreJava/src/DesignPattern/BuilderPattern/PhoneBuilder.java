package DesignPattern.BuilderPattern;

public class PhoneBuilder {
    private String phoneName;
    private String operatingSystem;
    private Integer version;
    private Integer ram;
    private Integer storage;
    private Integer price;

    public PhoneBuilder setPhoneName(String phoneName) {
        this.phoneName = phoneName;
        return this;
    }

    public PhoneBuilder setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    public PhoneBuilder setVersion(Integer version) {
        this.version = version;
        return this;
    }

    public PhoneBuilder setRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setStorage(Integer storage) {
        this.storage = storage;
        return this;
    }

    public PhoneBuilder setPrice(Integer price) {
        this.price = price;
        return this;
    }

    public Phone createPhone(){
        return new Phone(phoneName,operatingSystem,version,ram,storage,price);
    }
}
