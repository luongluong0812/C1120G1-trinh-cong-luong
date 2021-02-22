package repository;

import bean.Student;

import javax.lang.model.element.PackageElement;
import java.awt.image.AreaAveragingScaleFilter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository  implements InterfaceStudentRepository{
    private BaseRepository baseRepository=new BaseRepository();
    String sql_find_all="select id,age,`name`,email,address from student;";
    String sql_find_by_id="select id,age,name,email,address from student where id=?;";
    String sql_delete_by_id="delete from student where id=?;";
    String sql_update_by_id="update student set age=?,name=?,email=?,address=? where id=?;";
    String sql_add_student="insert into student(id,age,name,email,address) values(?,?,?,?,?);";

    @Override
    public List<Student> findAllStudent() throws SQLException {
      List<Student> list=new ArrayList<>();
        PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_find_all);
        ResultSet resultSet=preparedStatement.executeQuery();
        Student student=null;
        while (resultSet.next()){
            student=new Student();
            student.setId(Integer.parseInt(resultSet.getString("id")));
            student.setAge(Integer.parseInt(resultSet.getString("age")));
            student.setName(resultSet.getString("name"));
            student.setEmail(resultSet.getString("email"));
            student.setAddress(resultSet.getString("address"));
            list.add(student);

        }
        return list;
    }

    @Override
    public Student findByID(Integer id) throws SQLException {
        Student student=new Student();
        PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_find_by_id);
        ResultSet resultSet=preparedStatement.executeQuery() ;
        student.setId(Integer.parseInt(resultSet.getString("id")));
        student.setAge(Integer.parseInt(resultSet.getString("age")));
        student.setName(resultSet.getString("name"));
        student.setEmail(resultSet.getString("email"));
        student.setAddress(resultSet.getString("address"));
        return student;
    }

    @Override
    public boolean deleteStudent(Integer id) throws SQLException {
       PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_delete_by_id);
       preparedStatement.setString(1, String.valueOf(id));
       var res=preparedStatement.executeUpdate();
       if (res>0) return true;
       else return false;
    }

    @Override
    public boolean editStudent(Integer id) throws SQLException {
       PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_update_by_id);
       preparedStatement.setString(1,"age");
       preparedStatement.setString(2,"name");
       preparedStatement.setString(3,"email");
       preparedStatement.setString(4,"address");
       preparedStatement.setString(5,"id");
       preparedStatement.executeQuery();
       ResultSet resultSet=preparedStatement.executeQuery();
       if(resultSet!=null){ return true;}
       else return false;
    }

    @Override
    public boolean addStudent(Student student) throws SQLException {
        PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(sql_add_student);
        preparedStatement.setString(1, String.valueOf(student.getId()));
        preparedStatement.setString(2, String.valueOf(student.getAge()));
        preparedStatement.setString(3,student.getName());
        preparedStatement.setString(4,student.getEmail());
        preparedStatement.setString(5,student.getAddress());
        ResultSet resultSet=preparedStatement.executeQuery();
        if(resultSet!=null){ return true;}
        else return false;


    }

    @Override
    public void save() {

    }
}
