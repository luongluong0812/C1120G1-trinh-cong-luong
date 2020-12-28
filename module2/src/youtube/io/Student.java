package youtube.io;

import java.io.Serializable;

public class Student implements Serializable {
    private String id;
    private String name;
    private String dayOfBirth;

    public Student() {
    }

    public Student(String id, String name, String dayOfBirth) {
        this.id = id;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                '}';
    }
}
