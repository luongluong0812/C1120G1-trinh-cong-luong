package repository;

import bean.Phone;

import java.sql.SQLException;
import java.util.List;

public interface IPhoneRepository {
    List<Phone> findAll();
    Phone findById(int id);
    Boolean deleteById(int id) throws SQLException;
    void create();
    Boolean update();
}
