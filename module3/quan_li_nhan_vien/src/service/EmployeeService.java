package service;

import bean.Employee;
import repository.EmployeeIPLM;
import repository.IEmployeeRepository;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    private IEmployeeRepository employeeRepository=new EmployeeIPLM();

    @Override
    public List<Employee> findAllEmployee() {
        return employeeRepository.findAllEmployee();
    }

    @Override
    public Employee findById(int id) {
        return employeeRepository.findById(id);
    }

    @Override
    public String add(Employee employee) {
        return null;
    }

    @Override
    public String delete(Employee employee) {
        return null;
    }

    @Override
    public Boolean update(Employee employee) {
        return employeeRepository.update(employee);
    }
}
