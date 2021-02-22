package repository;

import bean.Phone;

import java.sql.SQLException;
import java.util.List;

public interface IPhoneRepository {
    List<Phone> findAll();
    Phone finById(int id) throws SQLException;
    void add(Phone phone);
    void delete(Integer id);
    void edit(Phone phone);
}
