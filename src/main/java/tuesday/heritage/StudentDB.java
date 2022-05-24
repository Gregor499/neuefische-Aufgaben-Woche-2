package tuesday.heritage;

import java.util.Arrays;

public class StudentDB {
        private Student[] allMyStudents;

    public StudentDB(Student[] allMyStudents) {
        this.allMyStudents = allMyStudents;
    }

    public Student[] list(){
        return allMyStudents;
    }

    public Student[] getStudenten() {
        return allMyStudents;
    }

    public String toString(){
        return "Unsere Schüler: " + Arrays.toString(allMyStudents);
    }

/*    public Student randomStudent(){
        Math.random();
        return;
    }*/
    }

