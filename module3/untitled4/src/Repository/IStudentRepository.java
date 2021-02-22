package Repository;
import bean.Student;

public interface IStudentRepository {
    void save(Student student);
    List<Student> findAll();
    Student findById(Integer id);
    void deleteById(Integer id);

}
