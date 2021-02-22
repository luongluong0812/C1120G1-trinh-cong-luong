package service.Iplm;

import bean.Student;
import reponsitory.IStudentRepository;
import reponsitory.StudentRepository;
import service.IStudentService;

import java.util.List;

public class StudentService  implements IStudentService {
    private IStudentRepository studentRepository=new StudentRepository();
    public boolean add(Student student){
        return studentRepository.add(student);
    }

    @Override
    public void save(Student student) {
studentRepository.save(student);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Integer id) {
        return studentRepository.findById(id);
    }

    @Override
    public boolean deleteById(Integer id) {
       return studentRepository.deleteById(id);


    }
}
