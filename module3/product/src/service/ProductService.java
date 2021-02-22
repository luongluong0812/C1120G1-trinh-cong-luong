package service;

import bean.Product;
import repository.IProductRepository;
import repository.ProductIplm;

import java.sql.SQLException;
import java.util.List;

public class ProductService implements  IProductService {
    private IProductRepository repository= new  ProductIplm();
    public void save(Product product) throws SQLException {
        repository.save(product);
    }
    public boolean create(Product product) throws SQLException {
        return repository.createProduct(product);
    }

    @Override
    public List<Product> findAll() throws SQLException {
        return repository.findAll();
    }

    @Override
    public Product findById(int id) throws SQLException {
        return repository.findById(id);
    }

    @Override
    public boolean deleteById(Integer id) throws SQLException {
        return repository.deleteById(id);
    }

    @Override
    public boolean createProduct(Product product) throws SQLException {
        return repository.createProduct(product);
    }
    public boolean update( int id) throws SQLException {
        return repository.deleteById(id);
    }


}
