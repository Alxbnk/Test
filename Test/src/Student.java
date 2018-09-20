import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Student {

    private String firstName;
    private String lastName;
    private String cpr;
    private String age;
    private String eMail;
    private String studieId;
    private String adress;
    private ArrayList<String> courses2;

    public Student() {
    }

    public Student(String firstName, String lastName, String cpr, String age, String eMail, String studieId, String adress, String[] courses, ArrayList<String> courses2) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cpr = cpr;
        this.age = age;
        this.eMail = eMail;
        this.studieId = studieId;
        this.adress = adress;
        this.courses2 = courses2;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getStudieId() {
        return studieId;
    }

    public void setStudieId(String studieId) {
        this.studieId = studieId;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }


    public ArrayList<String> getCourses2() {
        return courses2;
    }

    public void setCourses2(ArrayList<String> courses2) {
        this.courses2 = courses2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(cpr, student.cpr) &&
                Objects.equals(age, student.age) &&
                Objects.equals(eMail, student.eMail) &&
                Objects.equals(studieId, student.studieId) &&
                Objects.equals(adress, student.adress) &&
                Objects.equals(courses2, student.courses2);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cpr='" + cpr + '\'' +
                ", age='" + age + '\'' +
                ", eMail='" + eMail + '\'' +
                ", studieId='" + studieId + '\'' +
                ", adress='" + adress + '\'' +
                ", courses2=" + courses2 +
                '}';
    }
}
