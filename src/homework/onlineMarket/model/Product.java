package homework.onlineMarket.model;

import homework.onlineMarket.enums.EnumForProduct;

public class Product {
    private String id;
    private String name;
    private String description;
    private String price;
    private int stockQty;
    private EnumForProduct type;

    public Product(String id, String name, String description, String price, int stockQty, EnumForProduct type) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockQty = stockQty;
        this.type = type;
    }
    public Product() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getStockQty() {
        return stockQty;
    }

    public void setStockQty(int stockQty) {
        this.stockQty = stockQty;
    }

    public EnumForProduct getType() {
        return type;
    }

    public void setType(EnumForProduct type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", stockQty=" + stockQty +
                ", type=" + type +
                '}';
    }
}
