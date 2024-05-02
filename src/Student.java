import java.util.ArrayList;

public class Student {

    public static ArrayList<Student> studenci=new ArrayList<>();

    public static int maxDopLiczbaNiezaliczonychPrzedmoitow=5;

    private static int licznikStudentow=1;

    public static int CountPromotedStudents() {
        int licznik = 0;
        for (Student st : Student.studenci) {
            if (st.CanBePromoted()) {
                licznik++;
            }
        }
        return licznik;
    }


//============================================================================================

    private int IdStudent;

    private String FirstName;

    private String lastName;

    public String indexNumber;

    private ArrayList<Double> grades;


    public Student(int idStudent, String firstName, String lastName) {
        IdStudent = idStudent;
        FirstName = firstName;
        lastName = lastName;
        indexNumber="s"+licznikStudentow;
        licznikStudentow++;
        Student.studenci.add(this);
    }

    public int getIdStudent() {
        return IdStudent;
    }

    public void setIdStudent(int idStudent) {
        IdStudent = idStudent;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean CanBePromoted(){
        int liczbaNiezaliczonychPrzedmiotow=0;
        for(int i=0; i<grades.size(); i++){
            if(grades.get(i)==2){
                liczbaNiezaliczonychPrzedmiotow++;
            }
        }
        if(liczbaNiezaliczonychPrzedmiotow>maxDopLiczbaNiezaliczonychPrzedmoitow){
            return false;
        }
        return true;
    }

}
