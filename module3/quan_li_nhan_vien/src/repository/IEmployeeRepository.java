package repository;

import bean.Employee;

import java.util.List;

public interface IEmployeeRepository {

    List<Employee> findAllEmployee();
    Employee findById(int id);
    String add(Employee employee);
    String delete(Employee employee);
    Boolean update(Employee employee);

}
