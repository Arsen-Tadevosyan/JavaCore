package homework.onlineStore.storage;

import homework.onlineStore.model.Product;
import homework.onlineStore.util.StorageSerializeUtil;

import java.io.Serializable;
import java.util.*;

public class ProductStorage implements Serializable {

    private Set<Product> products = new HashSet<>();
    Map<String, Product> MapId = new HashMap<>();

    public void add(Product product) {
        products.add(product);
        MapId.put(product.getId(), product);
        StorageSerializeUtil.serializeProductStorage(this);
    }

    public Product getById(String id) {
        Product product = MapId.get(id);
        return product;
    }

    public void print() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
