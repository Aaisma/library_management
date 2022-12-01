package Module;

public class students {
    String name;
    String grade;
    String roll_no;
    String contact;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(String roll_no) {
        this.roll_no = roll_no;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public students(String name, String grade, String roll_no, String contact) {
        this.name = name;
        this.grade = grade;
        this.roll_no = roll_no;
        this.contact = contact;
    }

    public void printFormat5(){
        System.out.println(this.contact);
    }
    public void printFormat6(){
        System.out.println(this.name);
    }
    public void printFormats7(){
        System.out.println(this.grade);
    }
    public void printFormats8(){
        System.out.println(this.roll_no);
    }
}
