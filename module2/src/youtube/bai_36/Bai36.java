package youtube.bai_36;

public class Bai36 {
    public static void main(String[] args) {
        Person person1,person2;
        person1=new Person();
        person2=new Person();
        System.out.println(person1.toString()+"\n"+person2.toString());


    }
    static class Person{
        private String name;
        private String ID;
        private float salary;
        private String address;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public float getSalary() {
            return salary;
        }

        public void setSalary(float salary) {
            this.salary = salary;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

}
