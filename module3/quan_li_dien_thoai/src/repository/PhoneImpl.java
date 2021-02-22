package repository;

import bean.Phone;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhoneImpl implements IPhoneRepository{
    private BaseRepository baseRepository=new BaseRepository();
    String sql_findAllPhone="select id,name,price,color from phone;";
    String sql_find_by_id="select id,name,price,color from phone where id=?;";
    String sql_delete_by_id="delete from phone where id=?;";

    @Override
    public List<Phone> findAll() {
        List<Phone> phoneList=new ArrayList<>();
        try {
            PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_findAllPhone);
            ResultSet resultSet=preparedStatement.executeQuery();
            Phone phone=null;
            while (resultSet.next()){
                phone=new Phone();
                phone.setId(Integer.parseInt(resultSet.getString("id")));
                phone.setName(resultSet.getString("name"));
                phone.setPrice(Integer.parseInt(resultSet.getString("price")));
                phone.setColor(resultSet.getString("color"));
                phoneList.add(phone);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return phoneList;
    }

    @Override
    public Phone findById(int id) {
        Phone phone=new Phone();
        try {
            PreparedStatement preparedStatement =this.baseRepository.getConnection().prepareStatement(sql_find_by_id);
            preparedStatement.setString(1,"id");
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                phone.setId(Integer.parseInt(resultSet.getString("id")));
                phone.setName(resultSet.getString("name"));
                phone.setPrice(Integer.parseInt(resultSet.getString("price")));
                phone.setColor(resultSet.getString("color"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return phone;
    }

    @Override
    public Boolean deleteById(int id) throws SQLException {
        PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_delete_by_id);
        preparedStatement.setString(1,"id");
        int resultSet=preparedStatement.executeUpdate();
        if(resultSet>0) return true;
         return false;

    }

    @Override
    public void create() {

    }

    @Override
    public Boolean update() {
        return null;
    }
}
