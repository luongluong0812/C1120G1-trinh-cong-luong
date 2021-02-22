package service;

import bean.Customer;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerSerVice {
    List<Customer> findAll() throws SQLException;
    Customer findById(int id);
    void delete(int id) throws SQLException;
    void create(Customer customer);
    void edit(Customer customer);
}
