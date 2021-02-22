package repository;

import bean.Customer;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerRepository {

    List<Customer> findAll() throws SQLException;
    Customer findById(int id) throws SQLException;
    void delete(int id) throws SQLException;
    void create(Customer customer);
    void edit(Customer customer);
}
