package service;

import bean.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductService {
    List<Product> findAll() throws SQLException;
    Product findById(int id) throws SQLException;
    boolean deleteById(Integer id) throws SQLException;
    boolean createProduct(Product product) throws SQLException;
    public void save(Product product) throws SQLException;
}
