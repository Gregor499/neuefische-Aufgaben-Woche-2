package monday;

import java.util.Arrays;

public class StudentDB {
    private Student[] allMyStudents;

    public StudentDB(Student[] allMyStudents) {
        this.allMyStudents = allMyStudents;
    }

    public Student[] list() {
        return allMyStudents;
    }

    @Override
    public String toString() {
        return "Unsere Schüler:\n" + Arrays.toString(allMyStudents);
    }

    public Student randomStudent() {
        int randomIndex = ((int) (Math.random() * allMyStudents.length));
        return allMyStudents[randomIndex];
    }

    public void addStudent(String newStudentName) {
                Student[] studendArr = Student[(allMyStudents.length+1)];
        studendArr = allMyStudents;
        Student student = new Student("" + newStudentName);

        allMyStudents[allMyStudents.length+1] = student;
            }
}
