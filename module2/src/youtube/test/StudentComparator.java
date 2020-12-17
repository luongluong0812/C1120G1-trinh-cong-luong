package youtube.test;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        int a = student1.getName().compareTo(student2.getName());
        if (a > 0){
            return 1;
        } else if (a< 0) {
            return -1;
        } else{
            int value = student1.getAge() - student2.getAge();
            if (value > 0){
                return 1;}
//            }else  if(value<0){
//                return -1;
//            }
            else {
                return -1;
            }
        }
    }

}
