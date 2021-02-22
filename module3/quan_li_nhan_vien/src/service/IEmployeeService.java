package service;

import bean.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAllEmployee();
    Employee findById(int id);
    String add(Employee employee);
    String delete(Employee employee);
    Boolean update(Employee employee);
}
