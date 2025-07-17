package interviewPrep.java8;

public class Orders{

    private int orderId;
    private int amount;
    private String orderName;

    public Orders(int orderId, int amount, String orderName) {
        this.orderId = orderId;
        this.amount = amount;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
}
