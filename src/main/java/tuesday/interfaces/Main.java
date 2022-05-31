package tuesday.interfaces;

import monday.Student;
import monday.StudentDB;

public class Main {
    public static void main(String[] args) {
        monday.Student student1 = new monday.Student("Gustav");
        monday.Student student2 = new monday.Student("Peter");


        monday.Student[] myTestStudents = {student1, student2};
        monday.StudentDB testDb = new StudentDB(myTestStudents);
        monday.Student student3 = new Student("lal");

        testDb.addStudent(student3);

        System.out.println(testDb.list());
    }
}
