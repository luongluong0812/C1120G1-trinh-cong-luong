package service;

import bean.Laptop;
import repository.ILaptopRepository;
import repository.LaptopRepository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LaptopService implements ILaptopService {
    private ILaptopRepository laptopRepository = new LaptopRepository();

    @Override
    public List<Laptop> findAll() throws SQLException {
        return laptopRepository.findAll();
    }

    @Override
    public Laptop findById(int id) throws SQLException {
        return laptopRepository.findById(id);
    }

    @Override
    public void delete(Laptop laptop) throws SQLException {
        laptopRepository.delete(laptop);
    }

    @Override
    public void create(Laptop laptop) {
        try {
            laptopRepository.create(laptop);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
//    hai hd

//    public List<String> create(Laptop laptop, String e) throws SQLException {
//        List<String> error = new ArrayList<>();
//        if(laptop.getId()<0) {
//        error.add("Id khoong dduoc am");
//        } else {
//            laptopRepository.create(laptop);
//        }
//        return error;
//    }


    @Override
    public void edit(Laptop laptop) throws SQLException {
        laptopRepository.edit(laptop);
    }

    @Override
    public List<Laptop> findByName(String key) throws SQLException {
        return laptopRepository.findByName(key);
    }
}
