package repository;

import bean.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private BaseRepository baseRepository=new BaseRepository();
    String sql_find_all="select id,name,color from product;";
    String sql_find_by_id="select id,name,color from product where id=?;";
    String sql_add="update product set name=?,color=?";

    @Override
    public List<Product> finAll() throws SQLException {
       List<Product> list=new ArrayList<>();
        PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_find_all);
        ResultSet resultSet=preparedStatement.executeQuery();
        Product product=null;
        while (resultSet.next()){
            int id= Integer.parseInt(resultSet.getString("id"));
            String name=resultSet.getString("name");
            String color=resultSet.getString("color");
            product=new Product(id,name,color);
            list.add(product);

        }
        return list;
    }

    @Override
    public Product findById(int id) throws SQLException {
       PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_find_by_id);
       preparedStatement.setString(1, String.valueOf(id));
       ResultSet resultSet=preparedStatement.executeQuery();
       Product product=null;
       while (resultSet.next()){
           int idSearch= Integer.parseInt(resultSet.getString("id"));
           String name=resultSet.getString("name");
           String color=resultSet.getString("color");
           product=new Product(idSearch,name,color);
       }
       return product;
    }

    @Override
    public String add(Product product) {
        int resultSet=0;
        try {
            PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_add);
            preparedStatement.setString(1,product.getName());
            preparedStatement.setString(2,product.getColor());
             resultSet=preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (resultSet>0) return "ok";
        else return "nhap sai,nhap lai";
    }
}
