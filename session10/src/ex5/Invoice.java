package ex5;

public class Invoice {
    private String orderID;
    private double total;

    public Invoice(String orderID, double total) {
        this.orderID = orderID;
        this.total = total;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString(){
        return "mã hóa đơn: "+orderID+", số tiền: "+total;
    }
}
