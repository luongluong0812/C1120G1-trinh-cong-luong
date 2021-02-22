package service;

import bean.Student;

import java.util.List;

public interface IStudentService {

    void save(Student student);
    List<Student> findAll();
    Student findById(Integer id);
    boolean deleteById(Integer id);
    boolean add(Student student);
}
