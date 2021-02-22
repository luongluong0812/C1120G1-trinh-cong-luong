package service;

import bean.Product;
import repository.IProductRepository;
import repository.ProductRepository;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

public class ProductService implements IProductService {
    private IProductRepository productRepository=new ProductRepository();

    @Override
    public List<Product> finAll() throws SQLException {
        return productRepository.finAll();
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public String add(Product product) {
        if(product.getName()==null || product.getColor()==null){
            return  "nhap lai!";
        } else
        return productRepository.add(product);
    }
}
