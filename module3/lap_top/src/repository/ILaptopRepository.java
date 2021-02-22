package repository;

import bean.Laptop;
import bean.Phone;

import java.sql.SQLException;
import java.util.List;

public interface ILaptopRepository {
    List<Laptop> findAll() throws SQLException;
    Laptop findById(int id) throws SQLException;
    void delete(Laptop laptop) throws SQLException;
    void create(Laptop laptop) throws SQLException;
    void edit(Laptop laptop) throws SQLException;
    List<Laptop> findByName(String key) throws SQLException;
}
