package com.codegym.dao;

import com.codegym.model.Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private BaseRepository baseRepository = new BaseRepository();
    private static final String INSERT_USERS_SQL = "INSERT INTO student" + "  (id, name, age,address) VALUES " +
            " (?, ?, ?,?);";
    private final String SQL_UPDATE = "update student " +
            "set id=?,`name` = ?, age = ? ,address=? " +
            "where id = ?";
    private static final String SELECT_USER_BY_ID = "select id,name,age,address from student where id =?";
    private static final String SELECT_ALL_USERS = "select * from student";
    private static final String DELETE_USERS_SQL = "delete from student where id = ?;";
    private static final String UPDATE_USERS_SQL = "update student set id=?, name = ?,age= ?, address =? where id = ?;";

    public void save(Student student) {
        if (student.getId() == null) {
            // register student
        } else {

            try {
                PreparedStatement preparedStatement =
                        this.baseRepository.getConnection().prepareStatement(SQL_UPDATE);
                preparedStatement.setString(1, String.valueOf(student.getId()));
                preparedStatement.setString(2, student.getName());
                preparedStatement.setString(3, String.valueOf(student.getAge()));
                preparedStatement.setString(4, student.getAddress());

                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }



    @Override
    public void insertStudent(Student student) throws SQLException {

    }

    @Override
    public Student selectStudent(int id) throws SQLException {
        Student student = null;
        PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(SELECT_USER_BY_ID);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            student.setId(Integer.parseInt(resultSet.getString("id")));
            student.setName(resultSet.getString("name"));
            student.setAge(Integer.parseInt(resultSet.getString("age")));
            student.setAddress(resultSet.getString("address"));
        }
        return student;
    }

    @Override
    public List<Student> selectAllStudent() throws SQLException {
        List<Student> list = new ArrayList<>();
        PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(SELECT_ALL_USERS);
        ResultSet resultSet = preparedStatement.executeQuery();
        Student student = null;
        while (resultSet.next()) {
            student = new Student();
            student.setId(Integer.valueOf(resultSet.getString("id")));
            student.setName(resultSet.getString("name"));
            student.setAge(Integer.parseInt(resultSet.getString("age")));
            student.setAddress(resultSet.getString("address"));
            list.add(student);
        }
        return list;
    }

    @Override
    public boolean deleteStudent(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateStudent(Student student) throws SQLException {
        return false;
    }
}
