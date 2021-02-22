package repository;

import bean.Customer;

import javax.lang.model.element.PackageElement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private BaseRepository baseRepository=new BaseRepository();
    String sql_find_all="select * from learn_for_me.customer;";
    String sql_delete="delete from learn_for_me.customer where customer_id=?;";
    String sql_find_id="select * from learn_for_me.customer where customer_id=?;";

    @Override
    public List<Customer> findAll() throws SQLException {
        List<Customer> list=new ArrayList<>();
        PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_find_all);
        ResultSet resultSet=preparedStatement.executeQuery();
        Customer customer=null;
        while (resultSet.next()){
            int id= Integer.parseInt(resultSet.getString("customer_id"));
            int age= Integer.parseInt(resultSet.getString("customer_age"));
            String address=resultSet.getString("customer_address");
            String name=resultSet.getString("customer_name");
            customer=new Customer(id,age,address,name);
            list.add(customer);
        }
        return list;
    }

    @Override
    public Customer findById(int id) throws SQLException {

        PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_find_id);
        preparedStatement.setInt(1,id);
        ResultSet resultSet=preparedStatement.executeQuery();
        Customer customer=null;
        while (resultSet.next()){
            int idF= Integer.parseInt(resultSet.getString("id"));
            int age= Integer.parseInt(resultSet.getString("age"));
            String address=resultSet.getString("address");
            String name=resultSet.getString("name");
            customer=new Customer(idF,age,address,name);

        }
        return customer;
    }

    @Override
    public void delete(int id) throws SQLException {
PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_delete);
preparedStatement.setString(1, String.valueOf(id));
int res=preparedStatement.executeUpdate();
    }

    @Override
    public void create(Customer customer) {

    }

    @Override
    public void edit(Customer customer) {

    }
}
