package service;

import bean.Phone;
import repository.IPhoneRepository;
import repository.PhoneImpl;

import java.sql.SQLException;
import java.util.List;

public class PhoneService implements IPhoneService {
    private IPhoneRepository repository=new PhoneImpl();

    @Override
    public List<Phone> findAll() {
        return  repository.findAll();
    }

    @Override
    public Phone findById(int id) {
        return repository.findById(id);
    }

    @Override
    public Boolean deleteById(int id) throws SQLException {
            return repository.deleteById(id);
    }

    @Override
    public void create() {

    }

    @Override
    public Boolean update() {
        return null;
    }
}
