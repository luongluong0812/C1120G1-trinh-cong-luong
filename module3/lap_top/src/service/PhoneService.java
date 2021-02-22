package service;

import bean.Laptop;
import bean.Phone;
import repository.IPhoneRepository;
import repository.PhoneRepository;

import java.sql.SQLException;
import java.util.List;

public class PhoneService implements IPhoneService {
    private IPhoneRepository phoneRepository=new PhoneRepository();


    @Override
    public List<Phone> findAll() throws SQLException {
        return phoneRepository.findAll();
    }

    @Override
    public Phone findById(int id) throws SQLException {
        return phoneRepository.findById(id);
    }

    @Override
    public void delete(Phone phone) throws SQLException {
phoneRepository.delete(phone);
    }

    @Override
    public void create(Phone phone) throws SQLException {
phoneRepository.create(phone);
    }

    @Override
    public void edit(Phone phone) throws SQLException {
phoneRepository.edit(phone);
    }

    @Override
    public List<Phone> findByName(String key) throws SQLException {
        return phoneRepository.findByName(key);
    }
}
