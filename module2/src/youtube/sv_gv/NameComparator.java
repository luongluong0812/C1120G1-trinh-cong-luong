package youtube.sv_gv;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {



    @Override
    public int compare(Student student, Student t1) {
        int res=student.getTen().compareTo(t1.getTen());
        if (res>0){
            return 1;
        } else if(res==0){
            return 0;
        }else return -1;
    }
}
