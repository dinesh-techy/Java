package oops.encapsulation;

import java.util.StringJoiner;

public class BikeClass {
    public BikeClass() {
    }

    // Attributes in private
    private String bikeName;
    private Integer mfgDate;
    private Integer bikePrice;

    // Getters and Setters to access the private variable outside the class
    public Integer getMfgDate() {
        return mfgDate;
    }

    public void setMfgDate(Integer mfgDate) {
        this.mfgDate = mfgDate;
    }

    public String getBikeName() {
        return bikeName;
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    public Integer getBikePrice() {
        return bikePrice;
    }

    public void setBikePrice(Integer bikePrice) {
        this.bikePrice = bikePrice;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", BikeClass.class.getSimpleName() + "[", "]")
                .add("bikeName='" + bikeName + "'")
                .add("mfgDate=" + mfgDate)
                .add("bikePrice=" + bikePrice)
                .toString();
    }
}
