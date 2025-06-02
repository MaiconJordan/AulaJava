package exercicio;

import java.util.Date;

public class Order {

    private Date moment;
    private OrderStatus status;
    private Client client;
    private OrderItem[] items;

    public Order(Date moment, OrderStatus status, Client client, OrderItem[] items) {
        this.moment = moment;
        this.status = status;
        this.client = client;
        this.items = items;
    }

    public Date getMoment() {
        return moment;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public OrderItem[] getItems() {
        return items;
    }
    public void setItems(OrderItem[] items) {
        this.items = items;
    }

    public double total() {
        double sum = 0.0;
        for (OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ").append(moment).append("\n");
        sb.append("Order status: ").append(status).append("\n");
        sb.append("Client: ").append(client.getName()).append(" (").append(client.getEmail()).append(")\n");
        sb.append("Order items:\n");
        for (OrderItem item : items) {
            sb.append(item.getProduct().getName())
              .append(", $")
              .append(String.format("%.2f", item.getPrice()))
              .append(", Quantity: ")
              .append(item.getQuantity())
              .append(", Subtotal: $")
              .append(String.format("%.2f", item.subTotal()))
              .append("\n");
        }
        sb.append("Total price: $").append(String.format("%.2f", total()));
        return sb.toString();
    }       

       
}
