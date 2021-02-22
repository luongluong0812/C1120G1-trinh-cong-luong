package com.codegym.dao;

import com.codegym.model.Student;

import java.sql.SQLException;
import java.util.List;

public interface IStudentRepository {
    public void insertStudent(Student student) throws SQLException;

    public Student selectStudent(int id) throws SQLException;

    public List<Student> selectAllStudent() throws SQLException;

    public boolean deleteStudent(int id) throws SQLException;

    public boolean updateStudent(Student student) throws SQLException;
}
