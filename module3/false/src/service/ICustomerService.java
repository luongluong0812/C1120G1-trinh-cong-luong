package service;

import bean.Customer;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerService {
    List<Customer> finAll() throws SQLException;
    Customer findById(int id);
    void delete(int id);
    void create(Customer customer);
    void edit(Customer customer);
}
