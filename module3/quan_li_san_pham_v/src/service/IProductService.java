package service;

import bean.Product;
import repository.IProductRepository;
import repository.ProductRepository;

import java.sql.SQLException;
import java.util.List;

public interface IProductService {
    List<Product> finAll();
    void addNew(Product product) throws SQLException;
    void deleteProduct(Product product);
    Product findByID(int id);
    void edit(Product product);

}
