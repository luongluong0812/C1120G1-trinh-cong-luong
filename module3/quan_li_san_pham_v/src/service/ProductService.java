package service;

import bean.Product;
import repository.IProductRepository;
import repository.ProductRepository;

import java.sql.SQLException;
import java.util.List;

public class ProductService implements IProductService {
    private IProductRepository productRepository=new ProductRepository();

    @Override
    public List<Product> finAll() {
        return productRepository.finAll();
    }

    @Override
    public void addNew(Product product) throws SQLException {
productRepository.addNew(product);
    }

    @Override
    public void deleteProduct(Product product) {

    }

    @Override
    public Product findByID(int id) {
        return productRepository.findByID(id);
    }

    @Override
    public void edit(Product product) {
        productRepository.edit(product);

    }
}
