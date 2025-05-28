package exercicio;

public class OrderStatus {

    public static final OrderStatus PENDING_PAYMENT = new OrderStatus("PENDING_PAYMENT");
    public static final OrderStatus PROCESSING = new OrderStatus("PROCESSING");
    public static final OrderStatus SHIPPED = new OrderStatus("SHIPPED");
    public static final OrderStatus DELIVERED = new OrderStatus("DELIVERED");

    private String status;

    private OrderStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return status;
    }
    public String getStatus() {
        return status;
    }   
    public void setStatus(String status) {
        this.status = status;
    }

    public static OrderStatus valueOf(String status) {
        switch (status) {
            case "PENDING_PAYMENT":
                return PENDING_PAYMENT;
            case "PROCESSING":
                return PROCESSING;
            case "SHIPPED":
                return SHIPPED;
            case "DELIVERED":
                return DELIVERED;
            default:
                throw new IllegalArgumentException("Unknown status: " + status);
        }
    }
    public static OrderStatus[] values() {
        return new OrderStatus[] { PENDING_PAYMENT, PROCESSING, SHIPPED, DELIVERED };
}
}
