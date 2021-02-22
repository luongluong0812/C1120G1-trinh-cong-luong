package repository;

import bean.Customer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private BaseRepository baseRepository=new BaseRepository();
    String sql_fin_all="select * from customers;";
    String sql_find_by_id="select * from customers where customerId = ?";
    String sql_delete="delete from customers where customerId = ?;";
    String sql_edit="update customers set customerName=?,contactName=?,address=?,city=?,postalCode=?,country=? where customerId=?;";
    String sql_create="insert into customers(customerId,contactName,contactName,address,city,postalCode,country) values (?,?,?,?,?,?,?);";
    String sql_findByName="select * from customers where customerName like? ";

    @Override
    public List<Customer> findAll() throws SQLException {
        List<Customer> customerList=new ArrayList<>();
        PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_fin_all);
        ResultSet resultSet=preparedStatement.executeQuery();
        Customer customer=null;
        while (resultSet.next()){
            int id= Integer.parseInt(resultSet.getString("customerId"));
            String customerName=resultSet.getString("customerName");
            String contactName=resultSet.getString("contactName");
            String address=resultSet.getString("address");
            String city=resultSet.getString("city");
            String postalCode=resultSet.getString("postalCode");
            String country=resultSet.getString("country");
            customer=new Customer(id,customerName,contactName,address,city,postalCode,country);
            customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public Customer finById(int id) throws SQLException {
      PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_find_by_id);
      preparedStatement.setInt(1, id);
      ResultSet resultSet=preparedStatement.executeQuery();
      Customer customer=null;
      while (resultSet.next()){
          // (int customerId, String customerName, String contactName, String address, String city, String postalCode,
          // String country) {
          int customerId= Integer.parseInt(resultSet.getString("customerId"));
          String customerName=resultSet.getString("customerName");
          String contactName=resultSet.getString("contactName");
          String address=resultSet.getString("address");
          String city=resultSet.getString("city");
          String postalCode=resultSet.getString("postalCode");
          String country=resultSet.getString("country");
          customer=new Customer(customerId,customerName,contactName,address,city,postalCode,country);
      }
      return  customer;
    }

    @Override
    public void delele(int id) throws SQLException {
PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_delete);
preparedStatement.setInt(1,id);
int resultSet=preparedStatement.executeUpdate();

    }

    @Override
    public void edit(Customer customer) throws SQLException {
PreparedStatement preparedStatement =this.baseRepository.getConnection().prepareStatement(sql_edit);
preparedStatement.setString(1,customer.getCustomerName());
preparedStatement.setString(2,customer.getContactName());
preparedStatement.setString(3,customer.getAddress());
preparedStatement.setString(4,customer.getCity());
preparedStatement.setString(5,customer.getPostalCode());
preparedStatement.setString(6,customer.getCountry());
preparedStatement.setString(7, String.valueOf(customer.getCustomerId()));
int res=preparedStatement.executeUpdate();
    }

    @Override
    public void create(Customer customer) throws SQLException {
PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_create);

        preparedStatement.setString(1, String.valueOf(customer.getCustomerId()));
        preparedStatement.setString(2,customer.getCustomerName());
        preparedStatement.setString(3,customer.getContactName());
        preparedStatement.setString(4,customer.getAddress());
        preparedStatement.setString(5,customer.getCity());
        preparedStatement.setString(6,customer.getPostalCode());
        preparedStatement.setString(7,customer.getCountry());
        int res=preparedStatement.executeUpdate();


    }

    @Override
    public List<Customer> findByName(String name) throws SQLException {
        List<Customer> customerList=new ArrayList<>();
       PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_findByName);
       preparedStatement.setString(1,"%"+name+"%");
       ResultSet resultSet =preparedStatement.executeQuery();
       Customer customer=null;
       while (resultSet.next()){
           int customerId= Integer.parseInt(resultSet.getString("customerId"));
           String customerName=resultSet.getString("customerName");
           String contactName=resultSet.getString("contactName");
           String address=resultSet.getString("address");
           String city=resultSet.getString("city");
           String postalCode=resultSet.getString("postalCode");
           String country=resultSet.getString("country");
           customer=new Customer(customerId,customerName,contactName,address,city,postalCode,country);
           customerList.add(customer);
       }
       return customerList;
    }
}
