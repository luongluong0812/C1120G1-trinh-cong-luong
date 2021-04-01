package com.example.service;

import com.example.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductIplm implements ProductService {
    private static Map<Integer, Product> products = new HashMap<>();

    static {
        products.put(1, new Product(1, "iphone", 15));
        products.put(2, new Product(2, "sangsung", 16));
        products.put(3, new Product(3, "nokia", 17));
        products.put(4, new Product(4, "sony", 18));
    }


    @Override
    public List<Product> finAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product findById(int id) {
        System.out.println(products.get(id));
        return products.get(id);
    }

    @Override
    public void save(int id, Product product) {
        products.put(product.getId(), product);

    }

    @Override
    public void remove(int id, Product product) {
        products.remove(product.getId(), product);
    }

    @Override
    public void edit(int id, Product product) {
        products.put(id, product);
    }
}
