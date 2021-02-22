package service;

import bean.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductService {
    List<Product> finAll() throws SQLException;
    Product findById(int id);
    String add(Product product);
}
