package test.tap_then;

public class StudentCodeGymTest {

    public static void main(String[] args) {
//       StudentCodeGym studentCodeGym1 = new StudentCodeGym(1, "Tien", "2k", "covid-2019");
//      studentCodeGym1.

//        String quyenhan = "daotao1";
//
//        System.out.println(studentCodeGym1.getSick(quyenhan));


        StudentCodeGym studentCodeGym1 = new StudentCodeGym(1, "Nguyen Van A", "2k1", "abcxyz");
        studentCodeGym1.tienPhat += 5;

        System.out.println("So tien phat sau khi ban A bi phat: " + studentCodeGym1.tienPhat);

        StudentCodeGym studentCodeGym2 = new StudentCodeGym(2, "Nguyen Van B", "2k1", "abcxyz");
        studentCodeGym1.tienPhat += 5;

        System.out.println("So tien phat sau khi ban B bi phat: " + studentCodeGym2.tienPhat);

//        StudentCodeGym studentCodeGym = new StudentCodeGym();
        //.. scanner input thong tin
        // setter
    }
}
