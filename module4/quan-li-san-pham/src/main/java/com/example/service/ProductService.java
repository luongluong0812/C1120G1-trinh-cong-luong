package com.example.service;

import com.example.model.Product;

import java.util.List;

public interface ProductService {
  List<Product> finAll();
  Product findById(int id);
  void save(int id,Product product);
  void remove(int id,Product product);
  void edit(int id, Product product);

}
