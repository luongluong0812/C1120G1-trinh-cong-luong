package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductServiceIplm implements ProductService{
    private static Map<Integer, Product> productMap;
    static {
        productMap.put(1,new Product(1,"nokia",10,"red"));
        productMap.put(2,new Product(1,"nokia",10,"red"));
        productMap.put(3,new Product(1,"nokia",10,"red"));
        productMap.put(4,new Product(1,"nokia",10,"red"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remove(int id) {

    }
}
