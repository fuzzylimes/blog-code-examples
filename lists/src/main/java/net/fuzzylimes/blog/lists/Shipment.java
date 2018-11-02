package net.fuzzylimes.blog.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product> {

    public static final int MAX_WEIGHT = 20;
    private List<Product> products = new ArrayList<Product>();
    private List<Product> lightVanProducts = new ArrayList<Product>();
    private List<Product> heavyVanProducts = new ArrayList<Product>();

    public void add(Product product) {
        products.add(product);
    }

    public void replace(Product oldProduct, Product newProduct) {
        int idx = products.indexOf(oldProduct);
        if (idx >= 0) {
            products.set(idx, newProduct);
        }
    }

    public void prepare() {
        Collections.sort(products, Product.BYWEIGHT);
        int idx = findSplit();
        lightVanProducts = products.subList(0, idx);
        heavyVanProducts = products.subList(idx, products.size());
    }

    private int findSplit() {
        int idx = 0;
        for (Product product: products) {
            if (product.getWeightInLbs() > MAX_WEIGHT) {
                return idx;
            }
            idx += 1;
        }
        return idx;
    }

    public List<Product> getLightVanProducts() {
        return lightVanProducts;
    }

    public List<Product> getHeavyVanProducts() {
        return heavyVanProducts;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
