package service;

import bean.Student;
import repository.InterfaceStudentRepository;
import repository.StudentRepository;

import java.sql.SQLException;
import java.util.List;

public class StudentService implements InterfaceStudentRepository {
    private InterfaceStudentRepository repository=new StudentRepository();

    @Override
    public List<Student> findAllStudent() throws SQLException {
        return repository.findAllStudent();
    }

    @Override
    public Student findByID(Integer id) throws SQLException {
        return repository.findByID(id);
    }

    @Override
    public boolean deleteStudent(Integer id) throws SQLException {
        return repository.deleteStudent(id);
    }

    @Override
    public boolean editStudent(Integer id) throws SQLException {
        return repository.editStudent(id);
    }

    @Override
    public boolean addStudent(Student student) throws SQLException {
        return repository.addStudent(student);
    }

    @Override
    public void save() {

    }
}
