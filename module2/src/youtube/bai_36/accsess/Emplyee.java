package youtube.bai_36.accsess;

public class Emplyee extends Person {
    private float sallary;
    private String eID;
    private String role;

    public float getSallary() {
        return sallary;
    }

    public void setSallary(float sallary) {
        this.sallary = sallary;
    }

    public String geteID() {
        return eID;
    }

    public void seteID(String eID) {
        this.eID = eID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Emplyee(){

    }

    public Emplyee(float sallary, String eID, String role) {
        this.sallary = sallary;
        this.eID = eID;
        this.role = role;
    }

    public Emplyee(String name, String dateOfBirth, float sallary, String eID, String role) {
        super(name, dateOfBirth);
        this.sallary = sallary;
        this.eID = eID;
        this.role = role;
    }

    @Override
    public void showInfo() {
//        super.showInfo();
        System.out.println(name);
        System.out.println(dateOfBirth);
        System.out.println(sallary);
        System.out.println(eID);
        System.out.println(role);

    }
}
