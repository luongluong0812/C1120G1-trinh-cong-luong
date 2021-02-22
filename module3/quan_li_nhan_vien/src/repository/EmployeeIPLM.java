package repository;

import bean.Employee;

import javax.lang.model.element.PackageElement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeIPLM implements IEmployeeRepository{
    private BaseRepository baseRepository=new BaseRepository();
    String sql_find_all="select id,name,email,address from employee;";
    String sql_find_by_id="select id,name,email,address from employee where id=?";
    String sql_edit="update employee set name=?,email=?,address=? where id=?;";

    @Override
    public List<Employee> findAllEmployee() {
        List<Employee> list=new ArrayList<>();
        try {
            PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_find_all);
            ResultSet resultSet=preparedStatement.executeQuery();
            Employee employee=null;
            while (resultSet.next()){
                employee=new Employee();
                employee.setId(Integer.parseInt(resultSet.getString("id")));
                employee.setName(resultSet.getString("name"));
                employee.setEmail(resultSet.getString("email"));
                employee.setAddress(resultSet.getString("address"));
                list.add(employee);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Employee findById(int id) {
        Employee employee=null;
        try {
            PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_find_by_id);
            preparedStatement.setString(1, String.valueOf(id));
            ResultSet resultSet=preparedStatement.executeQuery();
            employee=new Employee();
            while (resultSet.next()){
                employee.setId(Integer.parseInt(resultSet.getString("id")));
                employee.setName(resultSet.getString("name"));
                employee.setEmail(resultSet.getString("email"));
                employee.setAddress(resultSet.getString("address"));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
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
        int resultSet=0;
        try {
            PreparedStatement preparedStatement =this.baseRepository.getConnection().prepareStatement(sql_edit);
            preparedStatement.setString(1,employee.getName());
            preparedStatement.setString(2,employee.getEmail());
            preparedStatement.setString(3,employee.getAddress());
            preparedStatement.setString(4, String.valueOf(employee.getId()));
             resultSet=preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (resultSet>0 ) return true;
         else return false;
    }
}
