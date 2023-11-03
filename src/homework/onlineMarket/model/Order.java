package homework.onlineMarket.model;

import homework.onlineMarket.enums.EnumForPaymentMethod;
import homework.onlineMarket.enums.EnumForStatus;

import java.util.Date;

public class Order {

    private String id;
    private User user;
    private Product product;
    private Date date;
    private String price;
    private EnumForStatus orderStatus;
    private int qty;
    private EnumForPaymentMethod paymentMethod;

    public Order(String id, User user, Product product, Date date,
                 String price, EnumForStatus orderStatus, int qty, EnumForPaymentMethod paymentMethod) {
        this.id = id;
        this.user = user;
        this.product = product;
        this.date = date;
        this.price = price;
        this.orderStatus = orderStatus;
        this.qty = qty;
        this.paymentMethod = paymentMethod;
    }

    public Order() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public EnumForStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(EnumForStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public EnumForPaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(EnumForPaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", user=" + user +
                ", product=" + product +
                ", date=" + date +
                ", price='" + price + '\'' +
                ", orderStatus=" + orderStatus +
                ", qty=" + qty +
                ", paymentMethod=" + paymentMethod +
                '}';
    }
}
