package service;

import bean.Customer;
import repository.CustomerRepository;
import repository.ICustomerRepository;

import java.sql.SQLException;
import java.util.List;

public class CustomerService implements ICustomerService {
    private ICustomerRepository customerRepository=new CustomerRepository();

    @Override
    public List<Customer> finAll() throws SQLException {
        return customerRepository.finAll();
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
