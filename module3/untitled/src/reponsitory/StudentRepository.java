package reponsitory;

import bean.Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private BaseRepository baseRepository = new BaseRepository();
   String SQL_FIND_ALL = "select id,age, `name`, address " +
            "from student";
    private final String SQL_FIND_BY_ID = "select id,age, name, address " +
            "from student " +
            "where id = ?";
    private final String SQL_UPDATE = "update student " +
            "set id=?, age=?,name = ?, address = ? " +
            "where id = ?";
    private final String SQL_DELETE_BY_ID = "delete from student where id = ?";
    String sql_add="insert into student(id,age,name,address) values(?,?,?,?)";
    public boolean add(Student student){
        try {
            PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_add);
            preparedStatement.setString(1, String.valueOf(student.getId()));
            preparedStatement.setString(2, String.valueOf(student.getAge()));
            preparedStatement.setString(3,student.getName());
            preparedStatement.setString(4,student.getAddress());
            preparedStatement.executeUpdate();
            if(preparedStatement.executeUpdate()>0) return true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void save(Student student) {
        if (student.getId() == null) {

        } else
            try {
                PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(SQL_UPDATE);
                preparedStatement.setString(1, String.valueOf(student.getId()));
                preparedStatement.setString(2, String.valueOf(student.getAge()));
                preparedStatement.setString(3, student.getName());
                preparedStatement.setString(4, student.getAddress());
                preparedStatement.setString(5, String.valueOf(student.getId()));
                int resultSet=preparedStatement.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }

    }

    @Override
    public List<Student> findAll() {
        List<Student> list = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(SQL_FIND_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            Student student = null;
            while (resultSet.next()) {
                student = new Student();
                student.setId(Integer.parseInt(resultSet.getString("id")));
                student.setAge(Integer.parseInt(resultSet.getString("age")));
                student.setName(resultSet.getString("name"));
                student.setAddress(resultSet.getString("address"));
                list.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Student findById(Integer id) {
        Student student = null;

        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(SQL_FIND_BY_ID);
            preparedStatement.setString(1, String.valueOf(id));
            ResultSet resultSet = preparedStatement.executeQuery();
            student = new Student();
            if (resultSet.next()) {
                student.setId(Integer.parseInt(resultSet.getString("id")));
                student.setAge(Integer.parseInt(resultSet.getString("age")));
                student.setName(resultSet.getString("name"));
                student.setAddress(resultSet.getString("address"));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }


    public boolean deleteById(Integer id) {

        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(SQL_DELETE_BY_ID);
            preparedStatement.setInt(1, id);
            var resultSet = preparedStatement.executeUpdate();
            if (resultSet > 1)
                return true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;

    }
}
