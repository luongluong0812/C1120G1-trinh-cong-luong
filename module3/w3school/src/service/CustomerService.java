package service;

import bean.Customer;
import repository.CustomerRepository;
import repository.ICustomerRepository;

import java.sql.SQLException;
import java.util.List;

public class CustomerService implements ICustomerService {
    private ICustomerRepository customerRepository=new CustomerRepository();

    @Override
    public List<Customer> findAll() throws SQLException {
        return customerRepository.findAll();
    }

    @Override
    public Customer finById(int id) throws SQLException {
        return customerRepository.finById(id);
    }

    @Override
    public void delele(int id) throws SQLException {
customerRepository.delele(id);
    }

    @Override
    public void edit(Customer customer) throws SQLException {
customerRepository.edit(customer);
    }

    @Override
    public void create(Customer customer) throws SQLException {
customerRepository.create(customer);
    }

    @Override
    public List<Customer> findByName(String name) throws SQLException {
        return customerRepository.findByName(name);
    }
}
