package repository;

import bean.Phone;

import javax.lang.model.element.PackageElement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhoneRepository implements IPhoneRepository {
    private BaseRepository baseRepository = new BaseRepository();
    String sql_find_all = "select id,name,price,color from phone;";
    String sql_delete_by_id="delete from phone where id=?;";
    String sql_find_by_id="select id,name,price,color from phone where id=? ";
    String sql_edit_by_id="update phone set name=?,price=?,color=? where id=?;";
    String sql_add="insert into phone(id,name,price,color) values (?,?,?,?);";

    @Override
    public List<Phone> findAll() {
        List<Phone> list = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(sql_find_all);
            ResultSet resultSet = preparedStatement.executeQuery();
            Phone phone = null;
            while (resultSet.next()) {
                phone = new Phone();
                phone.setId(Integer.parseInt(resultSet.getString("id")));
                phone.setName(resultSet.getString("name"));
                phone.setPrice(Integer.parseInt(resultSet.getString("price")));
                phone.setColor(resultSet.getString("color"));
                list.add(phone);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Phone finById(int id) throws SQLException {
       Phone phone=null;
       PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_find_by_id);
       preparedStatement.setString(1, String.valueOf(id));
       ResultSet resultSet=preparedStatement.executeQuery();
       while (resultSet.next()){
           phone=new Phone();
           phone.setId(Integer.valueOf(resultSet.getString("id")));
           phone.setName(resultSet.getString("name"));
           phone.setPrice(Integer.parseInt(resultSet.getString("price")));
           phone.setColor(resultSet.getString("color"));
       }
       return phone;
    }

    @Override
    public void add(Phone phone) {
        try {
            PreparedStatement preparedStatement =this.baseRepository.getConnection().prepareStatement(sql_add);
            preparedStatement.setString(1, String.valueOf(phone.getId()));
            preparedStatement.setString(2,phone.getName());
            preparedStatement.setString(3, String.valueOf(phone.getPrice()));
            preparedStatement.setString(4,phone.getColor());
            int res=preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Integer id) {
        try {
            PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_delete_by_id);
            preparedStatement.setString(1, String.valueOf(id));
            var resultSet=preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void edit(Phone phone) {
        try {
            PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_edit_by_id);
            preparedStatement.setString(1,phone.getName());
            preparedStatement.setString(2, String.valueOf(phone.getPrice()));
            preparedStatement.setString(3,phone.getColor());
            preparedStatement.setString(4, String.valueOf(phone.getId()));
            int resultSet=preparedStatement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
