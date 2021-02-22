package repository;

import bean.Laptop;
import bean.Phone;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhoneRepository implements IPhoneRepository {
    private BaseRepository baseRepository=new BaseRepository();

    String sql_find_all="select id,name,price,color from phone;";
    String sql_find_id="select id,name,price,color from phone where id=?;";
    String sql_delete="delete from phone where id=?";
    String sql_edit="update phone set name=?,price=?,color=? where id=?;";
    String sql_create="insert into phone(id,name,price,color) values(?,?,?,?);";
    String sql_find_by_name="select id,name,price,color from phone where name=?; ";

    @Override
    public List<Phone> findAll() throws SQLException {
        List<Phone> list=new ArrayList<>();
        PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_find_all);
        ResultSet resultSet=preparedStatement.executeQuery();
        Phone phone=null;
        while (resultSet.next()){

            int id= Integer.parseInt(resultSet.getString("id"));
            String name=resultSet.getString("name");
            int price= Integer.parseInt(resultSet.getString("price"));
            String color=resultSet.getString("color");
            phone=new Phone(id,name,price,color);
            list.add(phone);
        }
        return list;
    }

    @Override
    public Phone findById(int id) throws SQLException {
        PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_find_id);
        preparedStatement.setString(1, String.valueOf(id));
        ResultSet resultSet =preparedStatement.executeQuery();
        Phone phone=null;
        while (resultSet.next()){
            phone=new Phone();
            phone.setId(Integer.parseInt(resultSet.getString("id")));
            phone.setName(resultSet.getString("name"));
            phone.setPrice(Integer.parseInt(resultSet.getString("price")));
            phone.setColor(resultSet.getString("color"));
        }
        return phone;
    }

    @Override
    public void delete(Phone phone) throws SQLException {
        PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_delete);
        preparedStatement.setString(1, String.valueOf(phone.getId()));
        int res=preparedStatement.executeUpdate();

    }

    @Override
    public void create(Phone phone) throws SQLException {
        PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_create);
        preparedStatement.setString(1, String.valueOf(phone.getId()));
        preparedStatement.setString(2,phone.getName());
        preparedStatement.setString(3, String.valueOf(phone.getPrice()));
        preparedStatement.setString(4,phone.getColor());
        int res=preparedStatement.executeUpdate();

    }

    @Override
    public void edit(Phone phone) throws SQLException {
        PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_edit);
        preparedStatement.setString(1,phone.getName());
        preparedStatement.setString(2, String.valueOf(phone.getPrice()));
        preparedStatement.setString(3,phone.getColor());
        preparedStatement.setString(4, String.valueOf(phone.getId()));
        int res=preparedStatement.executeUpdate();

    }

    @Override
    public List<Phone> findByName(String key) throws SQLException {
        List<Phone> list=new ArrayList<>();
        PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_find_by_name);
        preparedStatement.setString(1,key);
        ResultSet resultSet=preparedStatement.executeQuery();
        Phone phone=null;
        while (resultSet.next()){
            phone=new Phone();
            int id= Integer.parseInt(resultSet.getString("id"));
            String name=resultSet.getString("name");
            int price= Integer.parseInt(resultSet.getString("price"));
            String color=resultSet.getString("color");
            phone=new Phone(id,name,price,color);
            list.add(phone);

        }
        return list;

    }
}
