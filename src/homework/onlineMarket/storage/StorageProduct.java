package homework.onlineMarket.storage;

import homework.onlineMarket.model.Product;

public class StorageProduct {
    private Product[] products = new Product[10];
    private int size;

    public void add(Product product) {
        if (size == products.length) {
            extend();
        }
        products[size++] = product;
    }

    private void extend() {
        Product[] tmp = new Product[products.length];
        System.arraycopy(products, 0, tmp, 0, size);
        products = tmp;
    }
}
