import java.util.ArrayList;

public class TestStudent {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student();
        student.setFirstName("Alex");
        student.setLastName("Banke");
        student.setAge("26");
        student.setAdress("DK");
        student.setCpr("140991");
        student.seteMail("Lol@kek.org");
        student.setStudieId("1337");


        ArrayList<String> courses = new ArrayList<>();
        courses.add("SW1");
        courses.add("SW2");
        courses.add("SW3");
        courses.add("SW4");
        student.setCourses2(courses);






        students.add(student);
        System.out.println(student.toString());
        System.out.println(students.toString());


    }

}
