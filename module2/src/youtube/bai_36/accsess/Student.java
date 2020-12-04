package youtube.bai_36.accsess;

public class Student implements Comparable<Student>{
    private String studentID;
    private String univerName;
    private float avgMark;
    public Student(){

    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getUniverName() {
        return univerName;
    }

    public void setUniverName(String univerName) {
        this.univerName = univerName;
    }

    public float getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(float avgMark) {
        this.avgMark = avgMark;
    }

    public Student(String studentID, String univerName, float avgMark) {
        this.studentID = studentID;
        this.univerName = univerName;
        this.avgMark = avgMark;
    }

    public Student(String name, String dateOfBirth, String studentID, String univerName, float avgMark) {
//        super(name, dateOfBirth);
        this.studentID = studentID;
        this.univerName = univerName;
        this.avgMark = avgMark;
    }


    public void showInfo() {
//        super.showInfo();
//        System.out.println(name);
//        System.out.println(dateOfBirth);
        System.out.println(studentID);
        System.out.println(univerName);
        System.out.println(avgMark);
    }

    @Override
    public int compareTo(Student o) {
        return o.studentID.compareTo(studentID);
    }
}
