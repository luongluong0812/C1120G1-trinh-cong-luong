package service;

import bean.Customer;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerService {
    List<Customer> findAll() throws SQLException;
    Customer finById(int id) throws SQLException;
    void delele(int id) throws SQLException;
    void edit(Customer customer) throws SQLException;
    void create(Customer customer) throws SQLException;
    List<Customer> findByName(String name) throws SQLException;
}
