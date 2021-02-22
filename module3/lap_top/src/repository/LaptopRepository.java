package repository;

import bean.Laptop;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LaptopRepository implements ILaptopRepository{
    private BaseRepository baseRepository=new BaseRepository();
    String sql_find_all="select id,name,price,color from laptop;";
    String sql_find_id="select id,name,price,color from laptop where id=?;";
    String sql_delete="delete from laptop where id=?";
    String sql_edit="update laptop set name=?,price=?,color=? where id=?;";
    String sql_create="insert into laptop(id,name,price,color) values(?,?,?,?);";
    String sql_find_by_name="select id,name,price,color from laptop where name=?; ";

    @Override
    public List<Laptop> findAll() throws SQLException {
       List<Laptop> list=new ArrayList<>();
        PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_find_all);
        ResultSet resultSet=preparedStatement.executeQuery();
        Laptop laptop=null;
        while (resultSet.next()){

            int id= Integer.parseInt(resultSet.getString("id"));
            String name=resultSet.getString("name");
            int price= Integer.parseInt(resultSet.getString("price"));
            String color=resultSet.getString("color");
            laptop=new Laptop(id,name,price,color);
            list.add(laptop);
        }
        return list;
    }

    @Override
    public Laptop findById(int id) throws SQLException {
        PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_find_id);
        preparedStatement.setString(1, String.valueOf(id));
        ResultSet resultSet =preparedStatement.executeQuery();
        Laptop laptop=null;
        while (resultSet.next()){
            laptop=new Laptop();
            laptop.setId(Integer.parseInt(resultSet.getString("id")));
            laptop.setName(resultSet.getString("name"));
            laptop.setPrice(Integer.parseInt(resultSet.getString("price")));
            laptop.setColor(resultSet.getString("color"));
        }
        return laptop;
    }

    @Override
    public void delete(Laptop laptop) throws SQLException {
        PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_delete);
        preparedStatement.setString(1, String.valueOf(laptop.getId()));
        int res=preparedStatement.executeUpdate();

    }

    @Override
    public void create(Laptop laptop) throws SQLException {
        PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_create);
        preparedStatement.setString(1, String.valueOf(laptop.getId()));
        preparedStatement.setString(2,laptop.getName());
        preparedStatement.setString(3, String.valueOf(laptop.getPrice()));
        preparedStatement.setString(4,laptop.getColor());
        int res=preparedStatement.executeUpdate();

    }

    @Override
    public void edit(Laptop laptop) throws SQLException {
        PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_edit);
        preparedStatement.setString(1,laptop.getName());
        preparedStatement.setString(2, String.valueOf(laptop.getPrice()));
        preparedStatement.setString(3,laptop.getColor());
        preparedStatement.setString(4, String.valueOf(laptop.getId()));
        int res=preparedStatement.executeUpdate();

    }

    @Override
    public List<Laptop> findByName(String key) throws SQLException {
        List<Laptop> list=new ArrayList<>();
       PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_find_by_name);
       preparedStatement.setString(1,key);
       ResultSet resultSet=preparedStatement.executeQuery();
       Laptop laptop1=null;
       while (resultSet.next()){
           laptop1=new Laptop();
           int id= Integer.parseInt(resultSet.getString("id"));
           String name=resultSet.getString("name");
           int price= Integer.parseInt(resultSet.getString("price"));
           String color=resultSet.getString("color");
           laptop1=new Laptop(id,name,price,color);
           list.add(laptop1);

       }
       return list;

    }
}
