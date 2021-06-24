package week8.day4.Task10;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private Long ID;
    private String status;
    private LocalDate localDate;
    private LocalDate deliveryData;
    private List<Product> products;
    private Customer customer;

    public Order(LocalDate localDate, LocalDate deliveryData, List<Product> products, Customer customer) {
        this.localDate = localDate;
        this.deliveryData = deliveryData;
        this.products = products;
        this.customer = customer;
    }

    Order(LocalDate localDate, LocalDate deliveryData, List<Product> products){
        this.localDate = localDate;
        this.deliveryData = deliveryData;
        this.products = products;
    }
    Order(){};

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public void setDeliveryData(LocalDate deliveryData) {
        this.deliveryData = deliveryData;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Long getID() {
        return ID;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public LocalDate getDeliveryData() {
        return deliveryData;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Customer getCustomer() {
        return customer;
    }


    @Override
    public String toString() {
        return "Order{" +
                "ID=" + ID +
                ", status='" + status + '\'' +
                ", localDate=" + localDate +
                ", deliveryData=" + deliveryData +
                ", products=" + products +
                ", customer=" + customer +
                '}';
    }
}
