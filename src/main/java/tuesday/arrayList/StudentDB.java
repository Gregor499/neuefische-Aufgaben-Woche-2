package tuesday.arrayList;

import java.util.ArrayList;

public class StudentDB {
    private ArrayList<Student> allMyStudents;

    public StudentDB(ArrayList<Student> allMyStudents) {
        this.allMyStudents = allMyStudents;
    }

    public ArrayList<Student> list(){
        return allMyStudents;
    }

    public ArrayList<Student> getStudenten() {
        return allMyStudents;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "allMyStudents=" + allMyStudents +
                '}';
    }

/*    public Student randomStudent(){
        Math.random();
        return;
    }*/
    }

