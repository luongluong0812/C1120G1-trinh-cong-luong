package repository;

import bean.Product;

import javax.lang.model.element.PackageElement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductIplm implements IProductRepository {
    private BaseRepository baseRepository=new BaseRepository();
    private final String SQL_FIND_ALL="select id,name,price,color from product;";
    private final String  SQL_FIND_ID="select id,name,price,color from product where id=?;";
    private final String SQL_UPDATE="update product set id = ?,name= ?, price =? , color=? where id = ?;";
    private final String SQL_DELETE="delete from product where id=?;";
    private final String SQL_ADD="insert into product(id,`name`,price,color) values (?,?,?,?);";
    public boolean update( int id) throws SQLException {
        PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(SQL_UPDATE);
        preparedStatement.setString(1, String.valueOf(id));
        var resultSet=preparedStatement.executeUpdate();
        if (resultSet>0) return true;
        return false;
    }

    @Override
    public List<Product> findAll() throws SQLException {
       List<Product> list=new ArrayList<>();
        PreparedStatement preparedStatement= this.baseRepository.getConnection().prepareStatement(SQL_FIND_ALL);
        ResultSet resultSet=preparedStatement.executeQuery();
        Product product=null;
        while (resultSet.next()){
            product=new Product();
            product.setId(Integer.parseInt(resultSet.getString("id")));
            product.setName(resultSet.getString("name"));
            product.setPrice(Integer.parseInt(resultSet.getString("price")));
            product.setColor(resultSet.getString("color"));
            list.add(product);
        }
        return list;
    }

    @Override
    public Product findById(int id) throws SQLException {
        PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(SQL_FIND_ID);
        preparedStatement.setString(1, String.valueOf(id));
        ResultSet resultSet = preparedStatement.executeQuery();

        Product product = null;
        product = new Product();
        while (resultSet.next()) {
            product.setId(Integer.parseInt(resultSet.getString("id")));
            product.setName(resultSet.getString("name"));
            product.setPrice(Integer.parseInt(resultSet.getString("price")));
            product.setColor(resultSet.getString("color"));

        }
        return product;
    }

    public void save(Product product) throws SQLException {
        if(product.getId()==null){
            //creat
        }
        else {
            PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(SQL_UPDATE);
            preparedStatement.setString(1, String.valueOf(product.getId()));
            preparedStatement.setString(2,product.getName());
            preparedStatement.setString(3, String.valueOf(product.getPrice()));
            preparedStatement.setString(4,product.getColor());
            preparedStatement.setString(5, String.valueOf(product.getId()));
            preparedStatement.executeUpdate();

        }
    }

    @Override
    public boolean deleteById(Integer id) throws SQLException {
        PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(SQL_DELETE);
        preparedStatement.setString(1, String.valueOf(id));
        var resultSet=preparedStatement.executeUpdate();
        if (resultSet>0) return true;
       else  return false;


    }

    @Override
    public boolean createProduct(Product product) throws SQLException {
        PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(SQL_ADD);
        preparedStatement.setString(1, String.valueOf(product.getId()));
        preparedStatement.setString(2,product.getName());
        preparedStatement.setString(3,String.valueOf(product.getPrice()));
        preparedStatement.setString(4,product.getColor());
        preparedStatement.executeUpdate();
        var res=preparedStatement.executeUpdate();
        if(res>0) return true;
        return false;
    }
}
