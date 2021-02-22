package service;

import bean.Laptop;

import java.sql.SQLException;
import java.util.List;

public interface ILaptopService {
    List<Laptop> findAll() throws SQLException;
    Laptop findById(int id) throws SQLException;
    void delete(Laptop laptop) throws SQLException;
    void create(Laptop laptop);
    void edit(Laptop laptop) throws SQLException;
    List<Laptop> findByName(String key) throws SQLException;
}
