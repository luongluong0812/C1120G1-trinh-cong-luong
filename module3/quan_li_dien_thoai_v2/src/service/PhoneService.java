package service;

import bean.Phone;
import repository.IPhoneRepository;
import repository.PhoneRepository;

import java.sql.SQLException;
import java.util.List;

public class PhoneService implements IPhoneService {
    private IPhoneRepository phoneRepository = new PhoneRepository();

    @Override
    public List<Phone> findAll() {
        return phoneRepository.findAll();
    }

    @Override
    public Phone finById(int id) throws SQLException {
        return phoneRepository.finById(id);
    }

    @Override
    public void add(Phone phone) {
        phoneRepository.add(phone);
    }

    @Override
    public void delete(Integer id) {
        phoneRepository.delete(id);
    }

    @Override
    public void edit(Phone phone) {
        phoneRepository.edit(phone);
    }
}
