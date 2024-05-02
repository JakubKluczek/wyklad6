import java.rmi.MarshalException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Student> studenci=new ArrayList<>();
    Student s=new Student(1, "Jan", "Kowalski");

    Student s2=new Student(2, "Anna", "Malewska");


    int liczbaPromowanychStudentow=Student.CountPromotedStudents();





    }
}