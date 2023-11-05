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

    public void printAllProduct() {
        for (int i = 0; i < size; i++) {
            System.out.println(products[i]);
        }
    }

    public Product getById(String id) {
        for (int i = 0; i < size; i++) {
            if (products[i].getId().equals(id)) {
                return products[i];
            }
        }
        return null;
    }


    public void deleteProductById(String Id) {
        int indexById = getIndexById(Id);
        if (indexById == -1) {
            System.out.println("product does not exists!");
            return;
        }
        for (int i = indexById; i < size; i++) {
            products[i] = products[i - 1];
        }
        size--;
    }

    private int getIndexById(String Id) {
        for (int i = 0; i < size; i++) {
            if (products[i].getId().equals(Id)) {
                return i;
            }
        }
        return -1;
    }
}