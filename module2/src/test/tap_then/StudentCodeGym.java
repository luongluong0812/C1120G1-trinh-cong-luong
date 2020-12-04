package test.tap_then;

public class StudentCodeGym {

    private int id;

    private String name;
    String nameDefault;
    protected String nameProtected;
    public String namePublic;

    private String dateOfBirth;
    private String sick;

    public static double tienPhat;
    public double tienPhatNonStatic;

//    public static void displayTienPhatStatic() {
//        System.out.println(tienPhat);
//        System.out.println(tienPhatNonStatic);
//    }
//
//    public void displayTienPhatNonStatic() {
//        System.out.println(this.tienPhatNonStatic);
//        System.out.println(tienPhat);
//    }

//    static {
//        tienPhat = 20;
//    }


    public StudentCodeGym(int id, String name, String dateOfBirth, String sick) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sick = sick;
    }

    public StudentCodeGym() {
    }

    public void printName() {
        System.out.println(this.name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSick(String quyenHan) {
        if (quyenHan.equals("daotao")) {
            return sick;
        }
        return "Ban khong co quyen xem thong tin nay";
    }

    public void setSick(String sick) {
        this.sick = sick;
    }
}
