package Labs.Laba_3;

public class Order {
    private String productName;
    private String address;
    private int orderCost;

    public Order(String productName, String address, int orderCost){
        this.productName = productName;
        this.address = address;
        this.orderCost = orderCost;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOrderCost(int orderCost) {
        this.orderCost = orderCost;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getAddress() {
        return address;
    }

    public int getOrderCost() {
        return orderCost;
    }

    public String getProductName() {
        return productName;
    }
}
