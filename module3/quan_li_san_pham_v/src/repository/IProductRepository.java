package repository;

import bean.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductRepository {
    List<Product> finAll();
    void addNew(Product product) throws SQLException;
    void deleteProduct(Product product);
    Product findByID(int id);
    void edit(Product product);
}
