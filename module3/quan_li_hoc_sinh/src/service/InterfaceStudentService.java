package service;

import bean.Student;

import java.sql.SQLException;
import java.util.List;

public interface InterfaceStudentService {
    List<Student> findAllStudent() throws SQLException;
    Student findByID(Integer id) throws SQLException;
    boolean deleteStudent(Integer id) throws SQLException;
    boolean editStudent(Integer id) throws SQLException;
    boolean addStudent(Student student) throws SQLException;
    void save();
}
