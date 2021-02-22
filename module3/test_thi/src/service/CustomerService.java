package service;

import bean.Customer;
import repository.CustomerRepository;
import repository.ICustomerRepository;

import java.sql.SQLException;
import java.util.List;

public class CustomerService implements ICustomerSerVice {
    private ICustomerRepository customerRepository=new CustomerRepository();

    @Override
    public List<Customer> findAll() throws SQLException {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public void delete(int id) throws SQLException {
customerRepository.delete(id);
    }

    @Override
    public void create(Customer customer) {

    }

    @Override
    public void edit(Customer customer) {

    }
}
