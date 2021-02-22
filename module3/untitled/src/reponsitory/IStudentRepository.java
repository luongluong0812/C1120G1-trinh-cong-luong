package reponsitory;

import bean.Student;

import java.util.List;

public interface IStudentRepository {
    void save(Student student);
    List<Student> findAll();
    Student findById(Integer id);
    boolean deleteById(Integer id);
    boolean add(Student student);

}
