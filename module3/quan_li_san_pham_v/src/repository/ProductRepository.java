package repository;

import bean.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository{
    private BaseRepository baseRepository=new BaseRepository();
    String sql_find_all="select id,name,price,color from product;";
    String sql_add_product="insert into product(id,name,price,color) values (?,?,?,?);";
    String sql_delete="delete from product where id=?;";
    String sql_find_by_id="select id,name,price,color from product where id=?;";
    String sql_edit_by_id="update product set name=?,price=?,color=? where id=?;";

    @Override
    public List<Product> finAll() {
       List<Product> list=new ArrayList<>();
        try {
            PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_find_all);
            ResultSet resultSet=preparedStatement.executeQuery();
            Product product=null;
            while (resultSet.next()){
                product=new Product();
                product.setId(Integer.parseInt(resultSet.getString("id")));
                product.setName((resultSet.getString("name")));
                product.setPrice(Integer.parseInt(resultSet.getString("price")));
                product.setColor(resultSet.getString("color"));
                list.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void addNew(Product product) throws SQLException {
        PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_add_product);
        preparedStatement.setString(1, String.valueOf(product.getId()));
        preparedStatement.setString(2,product.getName());
        preparedStatement.setString(3,String.valueOf(product.getPrice()));
        preparedStatement.setString(4,product.getColor());
        int res=preparedStatement.executeUpdate();

    }

    @Override
    public void deleteProduct(Product product) {
        PreparedStatement preparedStatement= null;
        try {
            preparedStatement = this.baseRepository.getConnection().prepareStatement(sql_delete);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public Product findByID(int id) {
       Product product=null;
        try {
            PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_find_by_id);
            preparedStatement.setString(1, String.valueOf(id));
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                product=new Product();
                product.setId(Integer.parseInt(resultSet.getString("id")));
                product.setName(resultSet.getString("name"));
                product.setPrice(Integer.parseInt(resultSet.getString("price")));
                product.setColor(resultSet.getString("color"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } return product;

    }

    @Override
    public void edit(Product product) {
        try {
            PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_edit_by_id);
            preparedStatement.setString(1,product.getName());
            preparedStatement.setString(1, String.valueOf(product.getPrice()));
            preparedStatement.setString(3,product.getColor());
            preparedStatement.setString(4, String.valueOf(product.getId()));
            int  resultSet=preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
