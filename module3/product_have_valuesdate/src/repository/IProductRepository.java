package repository;

import bean.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductRepository {
    List<Product> finAll() throws SQLException;
    Product findById(int id) throws SQLException;
    String add(Product product);

}
