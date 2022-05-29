package monday;

import java.util.Arrays;
import java.util.Objects;

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

    public void addStudent(Student newStudentName) {
        Student[] studArr = new Student[(allMyStudents.length+1)];
        for (int i = 0; i < allMyStudents.length; i++) {
            studArr[i] = allMyStudents[i];
        }

        studArr[allMyStudents.length] = newStudentName;
        allMyStudents = studArr;
            }

    public void removeStudent(String removeId) {
        if(!containsId(removeId)){
         System.out.println("Id nicht vorhanden!");
          return;
        }
        Student[] studArr = new Student[(allMyStudents.length-1)];
        int counter = 0;
        for (int i = 0; i < studArr.length; i++) {
            if (allMyStudents[i].getId().equals(removeId)){
                counter++;
            }
            studArr[i] = allMyStudents[i+counter];
        }
        allMyStudents = studArr;
    }

    public boolean containsId(String id) {
        for (Student s : allMyStudents) {
            if (s.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
