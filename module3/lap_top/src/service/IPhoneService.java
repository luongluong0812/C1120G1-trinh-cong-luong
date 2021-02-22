package service;

import bean.Laptop;
import bean.Phone;

import java.sql.SQLException;
import java.util.List;

public interface IPhoneService {
    List<Phone> findAll() throws SQLException;
    Phone findById(int id) throws SQLException;
    void delete(Phone phone) throws SQLException;
    void create(Phone phone) throws SQLException;
    void edit(Phone phone) throws SQLException;
    List<Phone> findByName(String key) throws SQLException;
}
