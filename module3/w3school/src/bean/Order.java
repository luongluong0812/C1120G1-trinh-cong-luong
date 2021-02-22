package bean;

public class Order {
    int customerId;
    int orderId;
    int employeeId;
    String orderDate;
    int shipperId;

    public Order() {
    }

    public Order(int customerId, int orderId, int employeeId, String orderDate, int shipperId) {
        this.customerId = customerId;
        this.orderId = orderId;
        this.employeeId = employeeId;
        this.orderDate = orderDate;
        this.shipperId = shipperId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public int getShipperId() {
        return shipperId;
    }

    public void setShipperId(int shipperId) {
        this.shipperId = shipperId;
    }
}
