package repository;

import bean.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductRepository {
    List<Product> findAll() throws SQLException;
    Product findById(int id) throws SQLException;
    boolean deleteById(Integer id) throws SQLException;
    boolean createProduct(Product product) throws SQLException;

    void save(Product product) throws SQLException;
}
