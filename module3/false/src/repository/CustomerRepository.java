package repository;

import bean.Customer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private BaseRepository baseRepository=new BaseRepository();
    String sql_find_all="select * from for_you.customer;";

    @Override
    public List<Customer> finAll() throws SQLException {
        List<Customer> list =new ArrayList<>();
        PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_find_all);
        ResultSet resultSet=preparedStatement.executeQuery();
        Customer customer=null;
        while (resultSet.next()){
            int id= Integer.parseInt(resultSet.getString("id_customer"));
            String name=resultSet.getString("name");
            String address=resultSet.getString("address");
            customer=new Customer(id,name,address);
            list.add(customer);

        }
        return list;
    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void create(Customer customer) {

    }

    @Override
    public void edit(Customer customer) {

    }
}
